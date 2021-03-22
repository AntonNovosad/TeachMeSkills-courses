package homeworks.Lesson16;


public class Registry extends Thread {
    private Action action;

    public Registry(Action action) {
        this.action = action;
    }

    @Override
    public void run() {
        action.patientQueue();
    }
}
