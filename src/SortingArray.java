import java.util.Arrays;

public class SortingArray {

    public static int[] sortArrays(int[] arr) {
        int length = arr.length;

        for (int j = 0; j < length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] array = { 2, 4, 9, 6, 21,
                11, 6, 7, 5, 4, 3 };
        System.out.println("Original array: "+ Arrays.toString(array));

        sortArrays(array);
        System.out.println("Sorted array: "
                + Arrays.toString(array));
    }
}

