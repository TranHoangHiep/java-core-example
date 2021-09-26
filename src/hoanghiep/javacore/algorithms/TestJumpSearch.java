package hoanghiep.javacore.algorithms;

public class TestJumpSearch {

    public static int jumpSearch(int arr[], int key) {

        int length = arr.length;

        int step = (int) Math.floor(Math.sqrt(length));
        int to = step;

        int prev = 0;
        while (arr[Math.min(to, length) - 1] < key) {
            prev = to;
            to += step;
            if (prev >= length)
                return -1;
        }

        while (arr[prev] < key) {
            prev++;
            if(prev == Math.min(to, length))
                return -1;
        }
        if (arr[prev] == key)
            return prev;

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 3, 4, 6, 8, 10, 13, 20, 25, 28, 30, 40, 50};
        int key = 50;

        int positionResult = jumpSearch(arr, key);

        if (positionResult == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + positionResult);
        }
    }
}
