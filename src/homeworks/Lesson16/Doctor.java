package homeworks.Lesson16;

public class Doctor extends Thread {
    private QualificationLevel qualificationLevel;
    private Action action;


    public Doctor(String name, QualificationLevel qualificationLevel, Action action) {
        super(name);
        this.qualificationLevel = qualificationLevel;
        this.action = action;
    }

    @Override
    public void run() {
        while (action.checkRegistry()) {
            action.healing(qualificationLevel);
        }
    }
}
