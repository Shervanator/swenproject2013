package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import programs.Quicksort;

public class QuicksortCoverageTest {

    /**
     * 
     * 100% line coverage, 77% mutation coverage
     */
    @Test
    public void quick_sort_coverage1() {
        int []init = {}; 
        int []expected = {};
        Quicksort qs = new Quicksort();
        qs.sort(init);
        
        assertArrayEquals("when the array is size one", expected, init); 
    }
    
    @Test
    public void quick_sort_coverage2() {
        int []init = {7,9,8,10}; 
        int []expected = {7,8,9,10};
        Quicksort qs = new Quicksort();
        qs.sort(init);
        
        assertArrayEquals("when the array is size one", expected, init); 
    }    
}
