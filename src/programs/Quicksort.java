package sort;

import java.util.Arrays;

/**
 * from: http://www.vogella.com/articles/JavaAlgorithmsQuicksort/article.html
 */
public class Quicksort {
    private int[] numbers;
    private int number;
    
    /** public static void main(String[] argv) {
        System.out.println("RUNNING");
        for (int i = 0; i < 1000000; i++) {
            int rand = (int) (Math.random() * 100);
            int myarray[] = new int [rand]; 
            int myarray2[] = new int [rand]; 

            for (int j = 0 ; j < rand ; j++) 
            { 
                myarray[j] = (int) (Math.random () * 1000); 
                myarray2[j] = myarray[j];
            }
            
            Quicksort s = new Quicksort();
            Arrays.sort(myarray);
            s.sort(myarray2);
            
            for (int j = 0 ; j < rand ; j++) 
            { 
                if (myarray2[j] != myarray[j]) {
                    System.out.println("NOT EQUAL!!!!");
                    System.out.println(myarray2.toString());
                }
            }
        }
        System.out.println("DONE");
    } **/

    public void sort(int[] values) {
      // check for empty or null array
      if (values ==null || values.length==0){
        return;
      }
      this.numbers = values;
      number = values.length;
      quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
      int i = low, j = high;
      // Get the pivot element from the middle of the list
      int pivot = numbers[low + (high-low)/2];

      // Divide into two lists
      while (i <= j) {
        // If the current value from the left list is smaller then the pivot
        // element then get the next element from the left list
        while (numbers[i] < pivot) {
          i++;
        }
        // If the current value from the right list is larger then the pivot
        // element then get the next element from the right list
        while (numbers[j] > pivot) {
          j--;
        }

        // If we have found a values in the left list which is larger then
        // the pivot element and if we have found a value in the right list
        // which is smaller then the pivot element then we exchange the
        // values.
        // As we are done we can increase i and j
        if (i <= j) {
          exchange(i, j);
          i++;
          j--;
        }
      }
      // Recursion
      if (low < j)
        quicksort(low, j);
      if (i < high)
        quicksort(i, high);
    }

    private void exchange(int i, int j) {
      int temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
    }
}
