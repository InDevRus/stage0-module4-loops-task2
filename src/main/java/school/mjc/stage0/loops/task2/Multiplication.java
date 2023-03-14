package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        var number = 0;

        if (multiplyByAndToInclusive == 0) {
            return;
        }

        while (number <= Math.abs(multiplyByAndToInclusive)) {
            System.out.println(number * multiplyByAndToInclusive);
            number += 1;
        }
    }
}
