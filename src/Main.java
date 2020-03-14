import utils.Partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(final String[] args) throws Exception {

        List entree = Arrays.asList(1,2,3,4,5);
        List<List<Integer>> test = new ArrayList<>();

        try {
            test = Partition.partition(entree,-2);
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }
        System.out.print(test);
    }

}
