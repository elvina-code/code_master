package AskarClass;

import java.util.ArrayList;
import java.util.List;

public class CarCom {
    public static void main(String[] args) {
//        create 3 cars put them a list
//        print out the cars' make, model, year if only if the millage is not more 100000 mileage
//        only need one System.out.println statement

        Car Tesla = new Car(2016, 9000, "Tesla", "Lambo", "black", 130000);
        Car Mercedes = new Car(2019, 19000, "mercedes Benz", "Gla 350", "grey", 80000);
        Car Toyota = new Car(2018, 130000, "Toyota Highlander", "LX 570", "white", 70000);


        List<Car> carsInTheStock = new ArrayList<>();
        carsInTheStock.add(Tesla);
        carsInTheStock.add(Mercedes);
        carsInTheStock.add(Toyota);

        for(Car car: carsInTheStock){
            if(car.mileage <100000){
                System.out.print(car.year + " ");
                System.out.print(car.make + " ");
                System.out.print(car.model + " ");
                System.out.println(car.mileage + " ");

            }
        }
        System.out.println(carsInTheStock);


    }
}
