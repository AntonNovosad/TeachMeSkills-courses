package homeworks.Lesson16;

import java.util.ArrayDeque;
import java.util.Queue;

public class Action {
    private Queue<Patient> patients = new ArrayDeque<>();

    public synchronized void patientQueue() {
        while (patients.size() < 10) {
            Patient patient = new Patient();
            String name = patient.getName();
            int age = patient.getAge();
            patients.offer(new Patient(name, age));
            System.out.println("Пришел пациент по имени " + name + ", возрастом " + age);
            System.out.println("В очереди " + patients.size() + " чел.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized boolean checkRegistry() {
        if (patients.size() != 0) {
            return true;
        }
        System.out.println("Пациентов нет в очереди");
        return false;
    }

    private int checkLevel(QualificationLevel qualificationLevel) {
        switch (qualificationLevel) {
            case INTERN:
                return 10000;
            case DEPARTMENTHEAD:
                return 7000;
            case ORDINARYDOCTOR:
                return 5000;
        }
        return 0;
    }

    public synchronized void healing(QualificationLevel qualificationLevel) {
        while (patients.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        String name = Thread.currentThread().getName();
        if (checkRegistry()) {
            System.out.println(qualificationLevel.getValue() + name + " принимает пациента " + patients.peek());
            try {
                Thread.sleep(checkLevel(qualificationLevel));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(qualificationLevel.getValue() + name + " принял пациента " + patients.peek());
            System.out.println("Пациент " + patients.peek() + " уходит.");
            patients.poll();
            System.out.println("В очереди " + patients.size() + " чел.");
            notify();
        }
    }
}
