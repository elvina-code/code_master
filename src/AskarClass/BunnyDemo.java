package AskarClass;

public class BunnyDemo {
    public static void main(String[] args) {
//        constructors create objects
//        default constructors no agruments explicitly.
        Bunny b1 = new Bunny();
        Bunny b2 = new Bunny();
        System.out.println(b1.color);
        System.out.println(b2.length);

        Bunny b3 = new Bunny("white");
        System.out.println(b3.color);
        System.out.println(b3.length);
        System.out.println(b3.height);

//        create a List before and pass the variable to the param.
//        Bunny b4 = new Bunny("green", 7,7,'M', );

    }
}
