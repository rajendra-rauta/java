package Dsa;

// public class recursion1 {

//     public static void printNum(int n){
//         if(n== 0){
//             return;
//         }
//         System.out.println(n);
//         printNum(n-1);
//     }
//     public static void main(String args[]){
//         int n=5;
//         printNum(n);
//     }
// }

// public class recursion1 {
//     public static void printNum(int n){
//         if(n== 6){
//             return;
//         }
//         System.out.println(n);
//         printNum(n+1);
//     }
//     public static void main(String args[]){
//         int n=1;
//         printNum(n);
//     }
// }

// calculate sum of n number

// public class recursion1 {
//     public static void printSum(int i, int n, int sum) {
//         if (i == n) {
//             sum += i;
//             System.out.println(sum);

//             return;
//         }
//         sum += i;
//         printSum(i + 1, n, sum);
//         System.out.println(i);

//     }

//     public static void main(String args[]) {

//         printSum(1, 5, 0);
//     }
// }


// print factorial of number n


// public class recursion1 {
//     public static int printFact(int n) {
//         if(n==1 || n==0){
//             return 1;
//         }

//        int fact_nm1= printFact(n-1);
//        int fact_n = n*fact_nm1;
//        return fact_n;

//     }

//     public static void main(String args[]) {
// int n= 5;
// int ans = printFact(n);
// System.out.println(ans);
//     }
// }





// fibonaic series 


public class recursion1 {
    public static void printFib(int a,int b, int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static void main(String args[]) {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;

        printFib(a, b, n-2);

    }
}