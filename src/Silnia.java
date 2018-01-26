
import java.util.Scanner;

public class Silnia {

    public static long SilniaMala(int n) {
        long s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę a ja obliczę jej silnie");
        int x = scan.nextInt();
        System.out.println("Silnia z "+x+" to "+SilniaMala(x)+"!");
    }
}
