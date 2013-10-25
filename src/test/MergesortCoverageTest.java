package test;

import static org.junit.Assert.*;

import org.junit.Test;

import programs.Bubblesort;
import programs.Mergesort;


public class MergesortCoverageTest {
	/**
	 * 100% line coverage test, only 82% mutation score
	 */
	@Test
	public void merge_sort_coverage1() {
		int []init = {2, 1, 9}; 
		int []expected = {1, 2, 9};
		Mergesort sort = new Mergesort();
		sort.sort(init);
		
		assertArrayEquals("when the array is size one", expected, init); 
	}
}
