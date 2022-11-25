package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        System.out.println(Math.max(first, second));
    }

    public static void main(String[] args) {
        TernaryGreatestNumberPrinter printer = new TernaryGreatestNumberPrinter();
        printer.printGreatest(-5, 2);
    }
}
