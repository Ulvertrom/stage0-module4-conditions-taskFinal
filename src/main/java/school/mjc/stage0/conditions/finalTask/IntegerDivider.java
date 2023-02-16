package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int quotient;
        if (divider != 0) {
            quotient = dividend / divider;
            System.out.println(dividend == (quotient * divider) ? "can be divided completely": "cannot be divided completely");
        } else {
            System.out.println("division by zero");
        }

    }
}
