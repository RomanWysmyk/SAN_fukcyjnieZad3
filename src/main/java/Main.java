import java.math.BigInteger;

public class Main {
    public static BigInteger fibonacci(int n) {

        //inicializacja dwóch elementów ciągu typu BigInteger aby mieć pewność nie wystapienia błędu overflow.
        BigInteger firstElement = BigInteger.ZERO;
        BigInteger secElement = BigInteger.ONE;

        //pentla iteruje tyle raz ile podajemy w zmiennej n i wylicza wartość ciągu.
        for (int i = 2; i <= n; i++) {
            BigInteger temporary = secElement;
            secElement = firstElement.add(secElement);
            firstElement = temporary;
        }

        return firstElement;
    }

    public static void main(String[] args) {
        int n = 100000;
        BigInteger result = fibonacci(n);
        System.out.println(" Fibbonaci z liczby kroków "+ n +" wynosi: " + result);
    }
}