// PROGRAM TO SHOW BUBBLE SORTING.....


public class bubble_sorting {
  public static void main(String[] args) {
    // Initialize an array to sort
    int[] arr = {5, 1, 4, 2, 8};

    // Perform bubble sort
    bubbleSort(arr);
     System.out.print("sorted array ");
    // Print the sorted array
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void bubbleSort(int[] arr) {
    // Flag that holds whether the array is sorted or not
    boolean sorted = false;

    // Loop through the array until it is sorted
    while (!sorted) {
      // Assume the array is sorted at the beginning of each iteration
      sorted = true;

      // Loop through the array and swap adjacent elements if they are out of order
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          // Swap the elements
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;

          // Set the flag to false since the array is not yet sorted
          sorted = false;
        }
      }
    }
  }
}
