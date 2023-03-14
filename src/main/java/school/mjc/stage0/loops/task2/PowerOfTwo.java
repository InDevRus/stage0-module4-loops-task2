package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        var exponent = 0;
        var powerOf2 = 1;

        while (exponent <= power) {
            System.out.println(powerOf2);
            exponent += 1;
            powerOf2 *= 2;
        }
    }
}
