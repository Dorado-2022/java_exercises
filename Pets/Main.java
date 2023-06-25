package Pets;

public class Main {
    public static void main(String[] args) {

        Dog buksi = new Dog();
        buksi.colourOfFur = "black";
        buksi.weight = 30.0;

        Cat cirmi = new Cat();
        cirmi.name = "cirmi";
        cirmi.breed = "russian blue";

        buksi.eat("táp");
        cirmi.play();
    }
}
