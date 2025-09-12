package com.java.datastructures;
import java.util.Arrays;
import java.util.UUID;
/**
 * 
 * @author Venkata.Pulipati
 * @since Monday 28-July-2025 15:06:59
 */
public class SortPerformanceComparison {

	public static void main(String[] args) {
        int size = 1000;
        String[] data = generateRandomStrings(size);

        comparePerformance("Bubble Sort", data, SortPerformanceComparison::bubbleSort);
        comparePerformance("Selection Sort", data, SortPerformanceComparison::selectionSort);
        comparePerformance("Insertion Sort", data, SortPerformanceComparison::insertionSort);
        comparePerformance("Merge Sort", data, SortPerformanceComparison::mergeSort);
        comparePerformance("Quick Sort", data, SortPerformanceComparison::quickSort);
    }

    static String[] generateRandomStrings(int size) {
//        Random rand = new Random();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = UUID.randomUUID().toString().substring(0, 8);
        }
        return arr;
    }

    static void comparePerformance(String name, String[] original, SortFunction sortFunction) {
        String[] copy = Arrays.copyOf(original, original.length);
        long start = System.nanoTime();
        sortFunction.sort(copy);
        long end = System.nanoTime();
        System.out.printf("%s took %.3f ms%n", name, (end - start) / 1e6);
    }

    // Bubble Sort
    static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Selection Sort
    static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            // Swap arr[i] and arr[minIdx]
            String temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    //Insertion Sort
    static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Merge Sort
    static void mergeSort(String[] arr) {
        if (arr.length <= 1) return;
        String[] temp = new String[arr.length];
        mergeSortRecursive(arr, temp, 0, arr.length - 1);
    }

    static void mergeSortRecursive(String[] arr, String[] temp, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSortRecursive(arr, temp, left, mid);
        mergeSortRecursive(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    static void merge(String[] arr, String[] temp, int left, int mid, int right) {
        System.arraycopy(arr, left, temp, left, right - left + 1);
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (temp[i].compareTo(temp[j]) <= 0) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }
        while (i <= mid) arr[k++] = temp[i++];
    }
    
    // Quick Sort
    static void quickSort(String[] arr) {
        quickSortRecursive(arr, 0, arr.length - 1);
    }

    static void quickSortRecursive(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortRecursive(arr, low, pi - 1);
            quickSortRecursive(arr, pi + 1, high);
        }
    }

    static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                // Swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (pivot)
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    @FunctionalInterface
    interface SortFunction {
        void sort(String[] arr);
    }
}
