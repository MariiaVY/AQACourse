public class Figures2 {

    public static void main(String[] args) {

        int rowcnt = 7;
        int i;
        int j;
        int m = 1;
        for (i = 1; i <= rowcnt; i++) {
            System.out.println();

            for (j = 1; j <= m; j++) {
                System.out.print("*");
            }
            m++;
        }
    }
}
