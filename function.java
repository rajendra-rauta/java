import java.util.*;

// public class function {
//     public static void printMyname(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){

//         Scanner sc =new Scanner(System.in);
//         String name =sc.next();
//         printMyname(name);
//     }
// }

// public class function {
//     public static int  calculateSum(int a ,int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String args[]){

//         Scanner sc =new Scanner(System.in);
//         int a =sc.nextInt();
//        int b =sc.nextInt();

//        int sum = calculateSum(a, b);
//        System.out.println("sum of two number :"+sum);
//     }
// }

// public class function {
//     public static int  calculateMul(int a ,int b){
//         int mul = a*b;
//         return mul;
//     }
//     public static void main(String args[]){

//         Scanner sc =new Scanner(System.in);
//         int a =sc.nextInt();
//        int b =sc.nextInt();

//        int mul = calculateMul(a, b);
//        System.out.println("product of two number :"+mul);
//     }
// }

// factorial of number 

public class function {
    public static void printFact(int num) {
        if(num<0){
            System.out.println("Invalid Number");
            return;

        }
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printFact(num);

    }
}