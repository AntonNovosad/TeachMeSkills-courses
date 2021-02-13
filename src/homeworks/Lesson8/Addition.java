package homeworks.Lesson8;

public class Addition implements Operation {

    @Override
    public void calculate(int numberOne, int numberTwo) {
        System.out.println(numberOne + numberTwo);
    }
}
