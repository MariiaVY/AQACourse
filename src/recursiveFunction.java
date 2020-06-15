//9. Write your own example of the recursive function. You can find a lot of examples on the Internet.

public class recursiveFunction {

public int pow(int x, int exp) {
    if (exp == 0) {
       return 1;
    }
    else {
      return x * pow(x, exp - 1);
    }
  }
    public static void main(String[] args) {
        recursiveFunction p = new recursiveFunction();
        System.out.println(p.pow(3, 2));
    }
}
