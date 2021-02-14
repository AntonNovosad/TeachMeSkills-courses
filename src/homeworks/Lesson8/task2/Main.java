package homeworks.Lesson8.task2;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(5, "acoustic");
        Drum drum = new Drum(4);
        Trumpet trumpet = new Trumpet(3, "Alt");
        Musician musician1 = new Musician("Anton", 24, guitar);
        Musician musician2 = new Musician("Alex", 18, drum);
        Musician musician3 = new Musician("Max", 30, trumpet);
        Musician musician4 = new Musician("John", 20, trumpet);

        musician1.performASong("Кузнечик");
        musician2.performASong("Марш");
        musician3.performASong("Прощание славянки");
        musician4.performASong("Марш");

        System.out.println();
        Musician[] quartet = {musician1, musician2, musician3, musician4};
        int maxAge = quartet[0].getAge();
        for (int i = 0; i < quartet.length; i++) {
            if (quartet[i].getAge() > maxAge) {
                maxAge = quartet[i].getAge();
            }
        }
        for (int i = 0; i < quartet.length; i++) {
            if (maxAge == quartet[i].getAge()) {
                quartet[i].performASong("Сидел в траве кузнечик");
            }
        }
    }
}
