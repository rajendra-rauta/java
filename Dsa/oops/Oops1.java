package Dsa.oops;

abstract class Animal {
    abstract void walk();
    public void eat() {
        System.out.println("Animal eat");
    }

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walk on two legs");
    }
}

public class Oops1 {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
       
    }
}