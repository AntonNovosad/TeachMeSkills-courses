package lessons.lesson7;

import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Привет");
        run();
        System.out.println("Пока");
    }


    private void run(){
        while (true){
            Drawable value = select();
            if (value == null){
                break;
            }
            value.draw();
        }
    }

    private Drawable select(){
       showMenu();
       int number = scanner.nextInt();
       switch (number){
           case 1:
               System.out.println("");
               int a = scanner.nextInt();
               return new Square();
           case 2: return new Triangle();
           case 3: return new Circle();
           case 0: return null;
       }
        System.out.println("failed");
       return select();
    }

    private void showMenu(){
        System.out.println("Choice figure");
        System.out.println("1 - Square");
        System.out.println("2 - Triangle");
        System.out.println("3 - Circle");
        System.out.println("0 - Exit");
    }
}
