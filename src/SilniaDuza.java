import java.math.BigInteger;
import java.util.Scanner;

public class SilniaDuza {

    public static BigInteger silnia(int n) {
        BigInteger s =BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę a ja obliczę jej silnie");
        int x = scan.nextInt();
        System.out.printf("Silnia z %d to %,d!",x,silnia(x
        ));
    }
}
