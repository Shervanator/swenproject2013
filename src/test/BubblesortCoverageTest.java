package test;

import static org.junit.Assert.*;

import org.junit.Test;

import programs.Bubblesort;


public class BubblesortCoverageTest {
	/**
	 * 100% line coverage test, only 73% mutation score
	 * Refer to folder a
	 */
	@Test
	public void bubble_sort_coverage1() {
		int []init = {2, 1}; 
		int []expected = {1, 2};
		Bubblesort sort = new Bubblesort();
		int []actual = sort.bubbleSort(init);
		
		assertArrayEquals("when the array is size one", expected, actual); 
	}
}
