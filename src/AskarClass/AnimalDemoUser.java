package AskarClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AnimalDemoUser {
    public static void main(String[] args) {
        System.out.println("employee app");
        Scanner scanner = new Scanner(System.in);

        List<Animal> stock = new ArrayList<>();//2.populate our stock


        String answer;
        do{
            Animal animalCreated = AnimalDemoEmployee.createAnimal();// 1.call createAnimal employee method to create animals
            stock.add(animalCreated);//3.add the animal to the list of animals(stock)
            System.out.println("Are you done?");//do until user says done
            answer = scanner.nextLine();
        }while (!answer.equalsIgnoreCase("done"));

        System.out.println("user app"); // ask client to input
        System.out.println("enter animal type");
        String type = scanner.nextLine();

        System.out.println("enter " + type + "breed");
        String breed = scanner.nextLine();

        System.out.println("enter gender");
        char gender = scanner.nextLine().charAt(0);

        for(Animal animal: stock){// looping through list
            if(animal.type.equalsIgnoreCase(type) && animal.breed.equalsIgnoreCase(breed) && animal.gender == gender){//accessing chacterictic to search critieria
                System.out.println(animal); // hashCode we dont have to String method in Animal class
                // print out all animals info that match the request
            }
        }








    }
}
