package hoanghiep.javacore.algorithms;

public class InterpolationSearch {

    public static int interpolationSearch(int arr[], int first, int last, int key) {

        if (last >= first) {
            int pos = first + ((key - arr[first]) * (last - first)) / (arr[last] - arr[first]);

            if (arr[pos] == key)
                return pos;

            if (arr[pos] < key)
                return interpolationSearch(arr, pos + 1, last, key);

            if (arr[pos] > key)
                return interpolationSearch(arr, first, pos - 1, key);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 6, 8, 10, 13, 20, 25, 28, 30, 40, 50};
        int key = 30;

        int positionResult = interpolationSearch(arr, 0, arr.length - 1, key);

        if (positionResult == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + positionResult);
        }
    }
}
