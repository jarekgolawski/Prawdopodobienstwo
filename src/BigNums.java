import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNums {

    public static void main(String[] args)
    {
        BigInteger Bi1,Bi2;
        BigDecimal Bd1;
        Bi1= new BigInteger("1000000000000000000");
        long l = 1000000000000000000L;
        Bi2= BigInteger.valueOf(l);
        System.out.println(Bi2.multiply(Bi1));
        System.out.println(Bi2.add(Bi1));
        System.out.println(Bi2.subtract(Bi1));
        System.out.println(Bi2.divide(Bi1));
    }
}
