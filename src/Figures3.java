public class Figures3 {

    public static void main(String[] args) {

         int num = 4;
        for ( int i = 1; i <= 5; i++ ) {
            for (int j = num; j >= 1; j--) {
                System.out.print(" ");
            }

            for ( int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
                System.out.println();
                num = num -1;
        }
    }
}
