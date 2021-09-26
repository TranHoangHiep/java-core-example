package hoanghiep.javacore.algorithms;

public class ExponentialSearch {

    public static int exponentialSearch(int arr[], int key) {
        int length = arr.length;
        if (arr[0] == key)
            return 0;

        int pos = 1;
        while (pos < length && arr[pos] < key) {
            pos = pos * 2;
        }

        return binarySearch(arr, pos / 2, Math.min(pos, length), key);
    }

    public static int binarySearch(int arr[], int first, int last, int key) {

        if (first <= last) {
            int middle = first + (last - first) / 2;

            if (arr[middle] == key)
                return middle;

            if (arr[middle] < key)
                return binarySearch(arr, middle + 1, last, key);

            if (arr[middle] > key)
                return binarySearch(arr, first, middle - 1, key);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 6, 8, 10, 13, 20, 25, 28, 30, 40, 50};
        int key = 10;

        int positionResult = exponentialSearch(arr, key);

        if (positionResult == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + positionResult);
        }
    }
}
