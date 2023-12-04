import java.util.Arrays;

public class SortList {
        public static void sortListImperative(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        public static void sortListDeclarative(int[] array) {
            Arrays.sort(array);
            int left = 0;
            int right = array.length - 1;
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        public static void main(String[] args) {
            int[] numbers = {15, 62, 0, 4, 25};

            sortListImperative(numbers);
            System.out.println(Arrays.toString(numbers));

            sortListDeclarative(numbers);
            System.out.println(Arrays.toString(numbers));
        }
    }