package homeworks.Lesson16;

import static homeworks.Lesson16.QualificationLevel.*;

public class Main {
    public static void main(String[] args) {
        Action action = new Action();
        Registry registry = new Registry(action);
        Doctor doctorOne = new Doctor("Ваня", INTERN, action);
        Doctor doctorTwo = new Doctor("Александр", ORDINARYDOCTOR, action);
        Doctor doctorThree = new Doctor("Денис", DEPARTMENTHEAD, action);

        registry.start();
        doctorOne.start();
        doctorTwo.start();
        doctorThree.start();
    }
}
