package sort;

public class Sorting {
 public static int[] bubbleSort(int[] array) {
	  int n, c, d;
	  n = array.length;
	  for (c = 0; c < ( n - 1 ); c++) {
		for (d = 0; d < n - c - 1; d++) {
			if (array[d] > array[d+1]) /* For descending order use < */
			{
				swap(array, d, d+1);
			}
		}
	  }
	  
	  return array;
  }

  public static void swap(int[] arr, int pos1, int pos2){
	    final int temp = arr[pos1];
	    arr[pos1] = arr[pos2];
	    arr[pos2] = temp;
	}
}