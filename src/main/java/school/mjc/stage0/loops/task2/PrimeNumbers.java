package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    boolean isPrime(int number) {
        var divisor = 2;
        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor += 1;
        }
        return true;
    }
    public void printPrimeNumbers(int printToInclusive) {
        var number = 2;
        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number += 1;
        }
    }
}
