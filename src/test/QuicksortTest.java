package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import sort.Quicksort;

public class QuicksortTest {

    /**
     * 
     * 100% line coverage, 77% mutation coverage
     */
    //@Test
    /**public void test1() {
        int []init = {}; 
        int []expected = {};
        Quicksort qs = new Quicksort();
        qs.sort(init);
        
        assertArrayEquals("when the array is size one", expected, init); 
    }**/
    
    //@Test
    /**public void test2() {
        int []init = {7,9,8,10}; 
        int []expected = {7,8,9,10};
        Quicksort qs = new Quicksort();
        qs.sort(init);
        
        assertArrayEquals("when the array is size one", expected, init); 
    }**/
    
    
    //===============================================================
    /**
     * 96% coverage, 88% mutation coverage (should kill all non-equ, still need to check though)
     */
    @Test
    public void test3() {
        int []init = {7,9,8,10,1}; 
        int []expected = {1,7,8,9,10};
        Quicksort qs = new Quicksort();
        qs.sort(init);
        
        assertArrayEquals("when the array is size one", expected, init); 
    }
}
