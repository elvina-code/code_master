package AskarClass;

import java.util.List;

public class Bunny {
    //    objects have state and behaviers
    public String color;
    public int length;
    public int height;
    public char gender;
    public List<String> vegetablesEaten;

//    purpose of overloading constructors:
//    give us ability to take only necessary info and skip some of instance variables


    public Bunny(){ // creating with no args constuctor we create object bunny. State is default. so color is null ect

    }
    public Bunny (String color){
        this.color = color;


    }
    public Bunny(String color, int length, int height){
        this.color =color;
        this.length =length;
        this.height =height;
    }
// create a new constructor right click -generate- choose all - ok
    public Bunny(String color, int length, int height, char gender, List<String> vegetablesEaten) {
        this.color = color;
        this.length = length;
        this.height = height;
        this.gender = gender;
        this.vegetablesEaten = vegetablesEaten;
    }
}
