package homeworks.Lesson8;

public class Division implements Operation {
    @Override
    public void calculate(int numberOne, int numberTwo) {
        double division = ((double) numberOne) / ((double) numberTwo);
        System.out.println(division);
    }
}
