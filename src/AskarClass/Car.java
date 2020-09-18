package AskarClass;

public class Car {

    /*public Car(int carYear, long carMileage, String carMake, String carModel, String carColor, double carPrice){
        year = carYear;
        mileage = carMileage;
        make =carMake;
        model =carModel;
        color =carColor;
        price =carPrice;*/
    public Car(int year, long mileage, String make, String model, String color, double price){
        this.year = year;
        this.mileage = mileage;
        this.make =make;
        this.model =model;
        this.color =color;
        this.price =price;


    }

    int year;
    public long mileage;
    protected String make;
    public String model;
    String color;
    double price;
//    right click generate to String everything chosen ok this is how to print list

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", mileage=" + mileage +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


