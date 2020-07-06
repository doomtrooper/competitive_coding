package gfg;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = {1,2,3,4};
        quickSort(data);
        System.out.println(data);
    }

    public static void quickSort(int[] arr) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        quickSort(temp, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start == end) return;
        int pivot = start;
        int pivotSortedIndex = sortPivot(arr, pivot, start, end);
        quickSort(arr, start, pivotSortedIndex);
        quickSort(arr, pivotSortedIndex + 1, end);
    }

    private static int sortPivot(int[] arr, int pivot, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            while (i < end && arr[i] <= arr[pivot]) i++;
            while (j > start && arr[j] >= arr[pivot]) j--;
            if (i < j) swap(arr, i, j);
        }
        swap(arr, j, pivot);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

