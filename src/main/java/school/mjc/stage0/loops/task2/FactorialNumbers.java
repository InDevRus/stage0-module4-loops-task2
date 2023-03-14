package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        var number = 0;
        var factorial = 1;

        while (number <= printToInclusive) {
            System.out.println(factorial);
            number += 1;
            factorial *= number;
        }
    }
}
