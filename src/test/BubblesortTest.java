package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.Sorting;


public class SortingTest {

	/**public void testCount1() {
		int []init = {14,8,17,56,23,0,57,4,25}; 
		int []expected = {0,4,8,14,17,23,25,56,57};
		int []actual = Sorting.bubbleSort(init);
		
		assertArrayEquals("true", expected, actual); 
	}**/
	
	
	//n = 1
	@Test
	public void test1() {
		int []init = {5, 6, 4}; 
		int []expected = {4, 5, 6};
		int []actual = Sorting.bubbleSort(init);
		
		assertArrayEquals("when the array is size one", expected, actual); 
	}
	

}
