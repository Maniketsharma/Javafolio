// Sortable interface
interface Sortable {
    void sort(int[] array);
}

// BubbleSort class implementing Sortable interface
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted using Bubble Sort:");
        printArray(array);
    }

    // Helper method to print the array
    private void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

// SelectionSort class implementing Sortable interface
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Find the index of the minimum element in the unsorted part of the array
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Sorted using Selection Sort:");
        printArray(array);
    }

    // Helper method to print the array
    private void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

// Main class to test the Sortable interface and sorting classes
public class i7{
    public static void main(String[] args) {
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        // Create instances of sorting classes
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();

        // Test sorting using Bubble Sort
        bubbleSort.sort(unsortedArray.clone());

        // Test sorting using Selection Sort
        selectionSort.sort(unsortedArray.clone());
    }
}
