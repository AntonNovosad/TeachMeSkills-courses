package homeworks.Lesson16.factories;

import homeworks.Lesson16.hospital.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PatientFactory {
    private static List<String> names;
    private static Random random = new Random();

    static {
        try {
            names = new ArrayList<>(Files.readAllLines(Paths.get("homeworks/Lesson16/factories/name.txt")));
        } catch (IOException e) {
            names = new ArrayList<>();
        }
    }

    public static Patient CreateName(){
        String name = names.get(random.nextInt(names.size()));
        int age = random.nextInt(100);
        return new Patient(name, age);
    }
}
