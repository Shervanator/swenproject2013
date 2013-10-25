package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import programs.Quicksort;

public class QuicksortMutationTest {
    /**
     * 96% coverage, 88% mutation coverage (should kill all non-equ)
     */
    @Test
    public void quick_sort_mutation1() {
        int []init = {7,9,8,10,1}; 
        int []expected = {1,7,8,9,10};
        Quicksort qs = new Quicksort();
        qs.sort(init);
        
        assertArrayEquals("when the array is size one", expected, init); 
    }
}
