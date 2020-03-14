package test;
import utils.Partition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class PartitionTest {
    @Test
    public void testPartitionResultAndSize() {
        List<Integer> in = Arrays.asList(1,2,3,4,5);
        List<List<Integer>> out = new ArrayList<>();
        out = Partition.partition(in,2);
        List<Integer> thirdPart = out.get(2);
        List<Integer> expectedResult = Arrays.asList(5);
        assertThat(out.size(), equalTo(3));
        assertThat(thirdPart, equalTo(expectedResult));
    }
    @Test
    public void testPartitionResultWhenMaxSizeIsGreaterThanListSize() {
        List<Integer> in = Arrays.asList(1,2,3,4,5);
        List<List<Integer>> out = new ArrayList<>();
        out = Partition.partition(in,15);
        List<Integer> partition = out.get(0);
        List<Integer> expectedResult = Arrays.asList(1,2,3,4,5);
        assertThat(out.size(), equalTo(1));
        assertThat(partition, equalTo(expectedResult));
    }


    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenPartitionSizeIsNegative() {
        List<Integer> in = Arrays.asList(1,2,3,4,5,7,8,9);
        List<List<Integer>> out = new ArrayList<>();
        out = Partition.partition(in,-3);
    }



}
