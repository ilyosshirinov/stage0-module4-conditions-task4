package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int x = first > second ? first : second;
        x = x > third ? x : third;
        System.out.println(x);
    }

    public static void main(String[] args) {
        TernaryMaxNumberPrinter printer = new TernaryMaxNumberPrinter();
        printer.printGreatest(9, 22,9);
    }
}
