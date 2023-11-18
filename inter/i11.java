// Sortable interface
interface Sortable {
    void sort(int[] array);
}

// QuickSort class implementing Sortable interface
class QuickSort implements Sortable {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted using QuickSort (Descending Order):");
        printArray(array);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Helper method to print the array
    private void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

// MergeSort class implementing Sortable interface
class MergeSort implements Sortable {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted using MergeSort (Descending Order):");
        printArray(array);
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays leftArray[] and rightArray[]
        System.arraycopy(array, low, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if there are any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if there are any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
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
public class i11{
    public static void main(String[] args) {
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        // Create instances of sorting classes
        Sortable quickSort = new QuickSort();
        Sortable mergeSort = new MergeSort();

        // Test sorting using QuickSort
        quickSort.sort(unsortedArray.clone());

        // Test sorting using MergeSort
        mergeSort.sort(unsortedArray.clone());
    }
}
