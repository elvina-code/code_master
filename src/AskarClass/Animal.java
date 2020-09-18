package AskarClass;

public class Animal {
    public String type;
    public int age; // if the age availabe in store, otherwise assign -1;
    public int duration;  // SMART criteria Specific Measurable Attainable Realistic Testable
    public char gender;
    public double weight;
    public boolean isInjured;
    public String breed;


    public Animal(String type, String breed, int age, int duration, char gender,  double weight, boolean isInjured){
        this.type =type;
        this.breed =breed;
        this.age = age;
        this.duration =duration;
        this.gender =gender;
        this.weight =weight;
        this.isInjured =isInjured;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", duration=" + duration +
                ", gender=" + gender +
                ", weight=" + weight +
                ", isInjured=" + isInjured +
                ", breed='" + breed + '\'' +
                '}';
    }
}
