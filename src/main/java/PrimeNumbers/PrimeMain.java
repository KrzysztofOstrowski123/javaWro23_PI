package PrimeNumbers;

import java.util.List;

public class PrimeMain {
    public static void main(String[] args) {
        PrimeCalcuator primeCalcuator = new PrimeCalcuator();
        System.out.println(primeCalcuator.isPrime(5));
        System.out.println(primeCalcuator.isPrime(12));
        System.out.println(primeCalcuator.isPrime(36));

        List<Integer> list = primeCalcuator.getPrimeNumbers(99);
        for(int i : list) {
            System.out.println(i + "   ");
        }
    }
}
