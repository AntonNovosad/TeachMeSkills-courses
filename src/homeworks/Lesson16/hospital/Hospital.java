package homeworks.Lesson16.hospital;

import homeworks.Lesson16.config.QualificationLevel;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Hospital {
    private BlockingQueue<Patient> patients = new ArrayBlockingQueue<>(10);


    public void start() {
        new Registry(patients).start();
        new Doctor("Антон", QualificationLevel.INTERN, patients).start();
        new Doctor("Коля", QualificationLevel.ORDINARY_DOCTOR, patients).start();
        new Doctor("Ваня", QualificationLevel.DEPARTMENT_HEAD_DOCTOR, patients).start();
    }
}
