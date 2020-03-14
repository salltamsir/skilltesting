package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Tamsir Ousmane
 * @version 1.0
 * @since   2020-03-14
 */
public class Partition {

    /**
     * Split a list into sublists of a given size.
     * @param liste, list to partotion.
     * @param size, max size of partitioj.
     * @return A list containing all sublists.
     */
    public static <T> List<List<T>> partition(List<T> liste, int size){

        // Throw exception when partition size is lower than 1
        if(size <1)
            throw new IllegalArgumentException("Size must be greater than 0");

        //List that will contain sublists
        List<List<T>> result = new ArrayList<>();

        //Number of sublists
        int nbIterations = liste.size()/size;
        int rest = liste.size()%size;

        //Crating sublists
        for (int i=0;i<nbIterations;i++){
            result.add(liste.subList(i*size,size*(i+1)));
        }

        // If the last sublist will have a lower size
        if(rest>0)
            result.add(liste.subList(size*nbIterations,liste.size()));

        return result;
    }
}
