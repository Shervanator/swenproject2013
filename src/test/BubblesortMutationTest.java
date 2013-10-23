package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.Bubblesort;


public class BubblesortMutationTest {
	/**
     * 100% line coverage, but 80% mutation coverage (all non-equ mutants)
     * refer to folder b
     */
	@Test
    public void bubble_sort_mutation1() {
        int []init = {3, 2, 1}; 
        int []expected = {1, 2, 3};
        Bubblesort sort = new Bubblesort();
        int []actual = sort.bubbleSort(init);
        
        assertArrayEquals("when the array is size one", expected, actual); 
    }
	
}
