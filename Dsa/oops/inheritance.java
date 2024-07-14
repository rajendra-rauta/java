package Dsa.oops;

import java.util.*;
import Dsa.bank.bank;

class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }

}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class inheritance {

    public static void main(String args[]) {
        bank.Account account1 = new bank.Account();

        account1.name = "Rajendra";
    }
}
