package homeworks.Lesson16.hospital;

import homeworks.Lesson16.factories.PatientFactory;

import java.util.concurrent.BlockingQueue;

public class Registry extends Thread {
    private BlockingQueue<Patient> patients;

    public Registry(BlockingQueue<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public void run() {
        while (true) {
            Patient patient = PatientFactory.CreateName();
            if (!patients.offer(patient)) {
                break;
            }
            System.out.printf("Пациент %s добавлен в очередь. Сейчас в очереди %s \n", patient, patients.size());
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Регистратура закончила работу.\n");
    }
}
