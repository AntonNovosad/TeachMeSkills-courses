package homeworks.Lesson16.hospital;

import homeworks.Lesson16.config.QualificationLevel;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Doctor extends Thread {
    private QualificationLevel qualificationLevel;
    private BlockingQueue<Patient> patients;

    public Doctor(String name, QualificationLevel qualificationLevel, BlockingQueue<Patient> patients) {
        super(name);
        this.qualificationLevel = qualificationLevel;
        this.patients = patients;
    }

    private int checkLevel(QualificationLevel qualificationLevel) {
        switch (qualificationLevel) {
            case INTERN:
                return 10000;
            case ORDINARY_DOCTOR:
                return 7000;
            case DEPARTMENT_HEAD_DOCTOR:
                return 5000;
        }
        return 0;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Patient patient = patients.poll(5, TimeUnit.SECONDS);
                if (patient == null) {
                    break;
                }
                System.out.printf("%s %s принял пациента %s. Сейчас в очереди %s \n", qualificationLevel.getValue(), getName(), patient, patients.size());
                sleep(checkLevel(qualificationLevel));
                System.out.printf("Пациент %s вылечен.\n", patient);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s закончил работу и пошел домой.\n", qualificationLevel.getValue());
    }
}
