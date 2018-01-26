import java.math.BigInteger;
import java.util.Scanner;

public class pwylosowaniakul {

    public static BigInteger silnia(int n) {
        BigInteger s =BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość kul z których będziesz losować: ");
        int n = scan.nextInt();
        System.out.println("Podaj ilość kul, które chcesz wylosować");
        int k = scan.nextInt();
        BigInteger p =silnia(n).divide( silnia(k).multiply(silnia(n-k)) );
        System.out.printf("Prawdopodobieństwo wylosowania %d kul z %d jest równe 1 do %,d!",k,n,p);

    }
}
