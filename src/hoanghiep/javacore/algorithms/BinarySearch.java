package hoanghiep.javacore.algorithms;

public class BinarySearch {

    // recursive function
    // return index of key
    private static int binarySearch(int[] arr, int firstPosition, int lastPosition, int key) {

        // check to recursive
        if (lastPosition >= firstPosition) {

            // find middle position
            int middle = firstPosition + (lastPosition - firstPosition) / 2;

            // if key == middle return middle
            if (key == arr[middle])
                return middle;

            // if key < middle recursive binary function
            // with left subarray from 0 to middle - 1
            if (key < arr[middle])
                return binarySearch(arr, firstPosition, middle - 1, key);

            // if key > middle recursive binary function
            // with right subarray from middle + 1 to last
            if (key > arr[middle])
                return binarySearch(arr, middle + 1, lastPosition, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 10, 20, 36, 57, 58};
        int arrLen = arr.length;
        int key = 58;

        int positionResult = binarySearch(arr, 0, arrLen - 1, key);
        if (positionResult == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found ad index: " + positionResult);
        }
    }
}
