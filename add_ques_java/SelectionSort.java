// sort an array using exchange selection sort , pass the array as argumwnt..

public class SelectionSort {

  public static void main(String[] args) {
    int[] array = {5, 3, 8, 1, 2, 9, 4, 7, 6};

    // print the original array
    System.out.println("Original array:");
    printArray(array);

    // sort the array using selection sort
    selectionSort(array);

    // print the sorted array
    System.out.println("\nSorted array:");
    printArray(array);
  }

  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}