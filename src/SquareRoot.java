public class SquareRoot {

    private static double[] sqrt(double[] array) {
        double[] sqrt = new double[array.length];
        for (int i = 0; i < array.length; i++)
            sqrt[i] = Math.sqrt(array[i]);
        return sqrt;
    }

    public static void main(String[] args) {

        double [] nums  = {16, 19, 95, 30, 10, 76, 3, 7, 57, 33};
        double [] sqrt = sqrt(nums);
        for(int i = 0; i < nums.length ; i++ )
            System.out.println ("Square root of " + nums[i] + " is " + sqrt[i]);
    }


}
