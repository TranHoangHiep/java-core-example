package hoanghiep.javacore.algorithms;

public class JumpSearch {

    // return index of key if found
    public static int jumpSearch(int arr[], int key) {
        int length = arr.length;

        // find block size to be jumped
        int step = (int) Math.floor(Math.sqrt(length));

        // finding the block where element is present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, length) - 1] < key) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(length));
            if (prev >= length)
                return -1;
        }

        // Doing a linear search for key in block beginning with prev
        while (arr[prev] < key) {
            prev++;

            // If we reached next block or end of array, element is not present.
            if (prev == Math.min(step, length))
                return -1;
        }
        if (arr[prev] == key)
            return prev;

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 6, 8, 10, 13, 20, 25, 28, 30, 40, 50};

        int key = 28;

        int positionResult = jumpSearch(arr, key);

        if (positionResult == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + positionResult);
        }
    }
}
