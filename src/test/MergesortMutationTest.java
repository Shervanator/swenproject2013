package test;

import static org.junit.Assert.*;

import org.junit.Test;

import programs.Bubblesort;
import programs.Mergesort;


public class MergesortMutationTest {
	/**
	 * 100% line coverage test, only 96% mutation score (full coverage)
	 */
	@Test
	public void merge_sort_mutation1() {
		int []init =     {2, 1, 9, 5, 2, 7, 1, 3, 5, 8, 2}; 
		int []expected = {1, 1, 2, 2, 2, 3, 5, 5, 7, 8, 9};
		Mergesort sort = new Mergesort();
		sort.sort(init);
		
		assertArrayEquals("when the array is size one", expected, init); 
	}
	
	@Test
    public void merge_sort_mutation2() {
        int []init =     {5, 4, 3, 2, 1}; 
        int []expected = {1, 2, 3, 4, 5};
        Mergesort sort = new Mergesort();
        sort.sort(init);
        
        assertArrayEquals("when the array is size one", expected, init); 
    }
}
