
// // sum of n natural number 
// import java.util.*;

// public class looping {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int sum =0;
//         for (int i = 1; i < num + 1; i++) {
//             sum = sum + i;

//         }
//         System.out.println(sum);

//     }
// }

// multiple table
import java.util.*;

public class looping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int num =sc.nextInt();
       System.out.println("our table is ");
      for(int i =1; i<11 ;i++){

    //    int  mul = num*i;
  
        System.out.println( num + " * " + i + " = "+ num*i);
      }

    }
}