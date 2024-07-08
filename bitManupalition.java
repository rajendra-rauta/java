// public class bitManupalition {
//     public static void main(String args[]){
//         int n = 5;
//         int pos= 2;
//         int bitMask= 1<<pos;

//         if((bitMask & n)==0){
//             System.out.println("bit was zero");
//         }
//         else{
//             System.out.println("bit was one");
//         }
//     }

// }

import java.util.*;;

// public class bitManupalition {
//     public static void main(String args[]){
//         int n = 5;
//         int pos= 2;
//         int bitMask= 1<<pos;
//         int notbitMask = ~(bitMask);

//         int  newnumber = notbitMask & n;
//         System.out.println(newnumber);
//     }

// }

public class bitManupalition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitmark = ~(bitMask);
            int newNumber = newBitmark & n;
            System.out.println(newNumber);
        }

    }

}