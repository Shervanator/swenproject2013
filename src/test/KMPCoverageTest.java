package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import programs.KMP;

public class KMPCoverageTest {
    /**
     * 100% line coverage test, only 86% mutation score
     * Refer to folder a
     */
    @Test
    public void kmp_coverage1() {
        KMP kmp = new KMP();
        int expected = 2;
        int actual = kmp.count("b", "aabbcc");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_coverage2() {
        KMP kmp = new KMP();
        int expected = -2;
        int actual = kmp.count("", "hello");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_coverage3() {
        KMP kmp = new KMP();
        int expected = 0;
        int actual = kmp.count("abaaa", "a");
        assertEquals("when the array is size one", expected, actual); 
    }
}
