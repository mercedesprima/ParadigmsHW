public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {25, 7, 155, 8, 78, 10, 44};
        int searchNumber = 4;
        int result = binarySearch(array, searchNumber);

        if (result == -1) {
            System.out.println("The element was not found in the array");
        } else {
            System.out.println("The element index is " + result);
        }
    }
    public static int binarySearch(int[] array, int searchNumber) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == searchNumber) {
                return middle;
            }

            if (array[middle] < searchNumber) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
