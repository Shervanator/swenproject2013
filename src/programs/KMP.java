package programs;

/**
 * From assignment 1, Tim Miller 2013.
 */
public class KMP {

    /** The minimum and maximum string length */
    public final static int MIN_LENGTH = 1;
    public final static int MAX_LENGTH = 256;

    /**
     * Finds the index of the first occurrence of a pattern in a string.
     * @param pattern the pattern to be searched for
     * @param text the string to search through
     * @return the offset of first occurrence of text in pattern, or -1
     *         if no match.
     */
    public int search(String pattern, String text, int [] next) {

      int i, j;
      for (i = 0, j = 0; i < text.length() && j < pattern.length(); i++) {
        //while we do not have a match, jump forward next[j] characters
        while (j >= 0 && text.charAt(i) != pattern.charAt(j)) {
          j = next[j];
        }

        //go to the next character in the pattern
        j++;
      }

      //if a match was found, return the offset
      if (j == pattern.length()) return i - pattern.length();

      //if a match was not found, return -1
      return -1;
    }

    /**
     * Counts the number of occurrences of a pattern in a string
     * @param pattern the pattern to be counted
     * @param text the string to search though
     * @return the number of times pattern occurs as a substring of text
     */
    public int count(String pattern, String text)
    {
      //check that the pattern is between MIN_LENGTH and MAX_LENGTH
      //characters long
      if (pattern.length() < MIN_LENGTH || pattern.length() > MAX_LENGTH) {
        return -2;
      }

      //create the 'next' table
      int [] next = createTable(pattern);

      //initial count and offset
      int count = 0;
      int offset = -1;

      //keep counting while we get a match
      do {
        offset = search(pattern, text, next);
        count += (offset >= 0 ? 1 : 0);
        text = text.substring(offset + 1, text.length());
      }
      while (offset >= 0);

      return count;
    }

    //create the table for the Knuth-Morris-Platt algorithm
    private int [] createTable(String pattern) {

      int [] next = new int[pattern.length()];
      int j = -1;
      for (int i = 0; i < pattern.length(); i++) {
        if (i == 0) next[i] = -1;
        else if (pattern.charAt(i) != pattern.charAt(j)) next[i] = j;
        else next[i] = next[j];
        while (j >= 0 
                && pattern.charAt(i) != pattern.charAt(j)) {
          j = next[j];
        }
        j++;
      }
      return next;
    }
  }