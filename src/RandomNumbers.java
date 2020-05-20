import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();

            System.out.println(arr[i]);
        }
    }
}
