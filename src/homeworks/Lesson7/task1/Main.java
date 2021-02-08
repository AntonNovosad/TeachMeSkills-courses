package homeworks.Lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Transport audi = new PassengerCar("Audi", 22, 200, 2000, 4, 10, "Седан", 4);
        Transport volvo = new AutoTruck("Volvo", 40, 100, 5000, 6, 20, 10000);

        Transport plane = new CivilPlane("boing", 200, 700, 25000, 40,1000, 200,true);
        Transport warPlane = new WarPlane("comet", 100, 1000, 15000, 20,2000, true,3);

        audi.descriptionGround();
        System.out.println("Задание автомобиля:");
        audi.distance(2.5);

        System.out.println();
        volvo.descriptionGround();
        System.out.println("Задание грузовика: ");
        volvo.carrying(1000);
        volvo.carrying(2000);
        volvo.carrying(7000);
        volvo.carrying(1);


        System.out.println();
        plane.descriptionAir();
        System.out.println("Задание для пассажирского самолета:");
        plane.passengers(100);
        plane.passengers(100);
        plane.passengers(1);

        System.out.println();
        warPlane.descriptionAir();

        warPlane.useRocket();
        warPlane.useRocket();
        warPlane.useRocket();
        warPlane.useRocket();

        System.out.println();
        warPlane.ejections();
        warPlane.ejections();

    }
}

