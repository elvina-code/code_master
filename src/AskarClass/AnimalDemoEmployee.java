package AskarClass;

import java.util.Scanner;

public class AnimalDemoEmployee {
    public  static Animal createAnimal() {// return type is Animal, name of method createAnimal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Animal Type");
        String type = sc.nextLine();
        System.out.println("enter " + type+ "breed");
        String breed = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter duration");
        int duration = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter gender");
        char gender = sc.nextLine().charAt(0);

        System.out.println("Enter weight");
        double weigth = sc.nextDouble();
        sc.nextLine();

        System.out.println("is injured");
        boolean isInjured = sc.nextBoolean();

        Animal animalFromEmployee = new Animal(type,breed,age,duration,gender,weigth,isInjured);
        return animalFromEmployee;

    }
}
