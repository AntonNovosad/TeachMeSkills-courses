package homeworks.Lesson7.task1;

public class Main {
    public static void main(String[] args) {
        PassengerCar audi = new PassengerCar("Audi", 22, 200, 2000, 4, 10, "Седан", 4);
        AutoTruck volvo = new AutoTruck("Volvo", 40, 100, 5000, 6, 20, 10000);

        CivilPlane boing = new CivilPlane("boing", 200, 700, 25000, 40,1000, 200,true);
        WarPlane comet = new WarPlane("comet", 100, 1000, 15000, 20,2000, true,3);

        audi.description();
        System.out.println("Задание автомобиля:");
        audi.distance(2.5);

        System.out.println();
        volvo.description();
        System.out.println("Задание грузовика: ");
        volvo.carrying(1000);
        volvo.carrying(2000);
        volvo.carrying(7000);
        volvo.carrying(1);


        System.out.println();
        boing.description();
        System.out.println("Задание для пассажирского самолета:");
        boing.passengers(100);
        boing.passengers(100);
        boing.passengers(1);

        System.out.println();
        comet.description();

        comet.useRocket();
        comet.useRocket();
        comet.useRocket();
        comet.useRocket();

        System.out.println();
        comet.ejections();
        comet.ejections();
    }
}

