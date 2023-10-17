import java.math.BigInteger;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//    double x = 5;
//    double y = -5;
//    System.out.print("Positive double/0: ");
//    System.out.println(x/0);
//
//    System.out.print("Negative double/0: ");
//    System.out.println(y/0);
//
//    System.out.print("Infinity - infinity: ");
//    System.out.println(x/0 - x/0);

        int nrOfSquares = 64;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < nrOfSquares; i++) {
            sum = sum.add(BigInteger.ONE.shiftLeft(i));
        }
        System.out.println(sum);
    }
}