package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import programs.KMP;

public class KMPMutationTest {
    /**
     * 100% line coverage test, only 100% mutation score
     */
    @Test
    public void kmp_mutation1() {
        KMP kmp = new KMP();
        int expected = 2;
        int actual = kmp.count("b", "aabbcc");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_mutation2() {
        KMP kmp = new KMP();
        int expected = -2;
        int actual = kmp.count("", "a");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_mutation3() {
        KMP kmp = new KMP();
        int expected = 0;
        String pattern = new String(new char[256]).replace("\0", "a");
        int actual = kmp.count(pattern, "a");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_mutation4() {
        KMP kmp = new KMP();
        int expected = -2;
        String pattern = new String(new char[257]).replace("\0", "a");
        int actual = kmp.count(pattern, "a");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_mutation5() {
        KMP kmp = new KMP();
        int expected = 3;
        int actual = kmp.count("a", "aaba");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_mutation6() {
        KMP kmp = new KMP();
        int expected = 2;
        int actual = kmp.count("abcdcba", "abcdcbaabcdcba");
        assertEquals("when the array is size one", expected, actual); 
    }
    
    @Test
    public void kmp_mutation7() {
        KMP kmp = new KMP();
        int expected = 2;
        int actual = kmp.count("abc", "abbabaabaabcabcaabbcc");
        assertEquals("when the array is size one", expected, actual); 
    }
}
