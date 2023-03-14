package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        var number = 0;
        while (number <= lastPrinted) {
            System.out.println(number);
            number += 1;
        }
    }
}
