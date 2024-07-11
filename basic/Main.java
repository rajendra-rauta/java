import java.util.*;

// public class  Main {
//     public static void main(String[] args) {
//       try (Scanner sc = new Scanner(System.in)) {
//         String name = sc.next();
//         System.out.println(name);
//       } 
//         }
// }

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age > 18) {
      System.out.println("adult");
    } else {
      System.out.println("you are not adult ");
    }

  }
}