package homeworks.Lesson9;

public class CarException extends Exception {
    private int value;

    public CarException(int value) {
        this.value = value;
    }

    public String getMessage() {
        return "Число " + value + " четное, машина не заведется";
    }
}
