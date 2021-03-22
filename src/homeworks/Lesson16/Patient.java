package homeworks.Lesson16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Patient {
    private String name;
    private int age;
    private Random random = new Random();

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    public String getName() {
        List<String> names = new ArrayList<>();
        try {
            names = Files.readAllLines(Paths.get("src/homeworks/Lesson16/name.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names.get(random.nextInt(names.size()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return random.nextInt(100);
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name +
                ", возрастом " + age;
    }
}
