package Dsa.oops;
class pen {
    String color;
    String type; // ballpoint; gel

    public void write() {
        System.out.println("Writting somthing");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
}

public class oops {

    public static void main(String args[]){
      Student s1 = new Student(" happy", 20);
     
      s1.printInfo();
    }
    
} 