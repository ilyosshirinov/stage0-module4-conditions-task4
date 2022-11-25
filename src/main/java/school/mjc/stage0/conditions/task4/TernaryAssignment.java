package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int x = (first > second) ? (10) : (-10);
        System.out.println(x);
    }

    public static void main(String[] args) {
        TernaryAssignment assignment = new TernaryAssignment();
        assignment.assignAndPrintBasedOnWhichBigger(3, 5);
    }
}
