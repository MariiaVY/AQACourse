public class SumOfArrayElements {

    public static void main(String[] args) {

        int[] array = {4, 5, 3, 7, 6, 4, 10, 20, 30, 3};
        int sum =0;

        for (int i = 1; i < array.length -1; i++) {
            sum = sum + array[i];

    }
        System.out.println("Sum of array elements except the first one and the last one : "+ sum);

    }
}
