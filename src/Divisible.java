public class Divisible {

    public static void main(String[] args) {

            for (int num = 1; num <= 100; num++) {
                if ((num % 3 == 0 && num % 5 == 0) && num % 2 != 0) {
                    System.out.print(num + ", ");
                }
            }
        }
    }



