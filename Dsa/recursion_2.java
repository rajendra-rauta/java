package Dsa;

// public class recursion_2 {
//     public static void towerOfHanoi(int n, String src, String helper, String dest){
//         if(n == 1){
//             System.out.println("transfer disk " + n + " from "+ src+ " to "+dest);
//             return ;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk " + n + " from "+ src+ " to "+dest);
//         towerOfHanoi(n-1, helper ,src,dest);
//     }
//     public static void main(String args[]){
//         int n=3;
//         towerOfHanoi(n,"S", "h", "D");

//     }
// }

// print a string in reverse 

// public class recursion_2 {

//     public static void printRev(String str , int idx){
//         if(idx ==0){
//             System.out.println(str.charAt(idx));
//             return; 
//         }
//         System.out.print(str.charAt(idx));
//         printRev(str,  idx-1);
//     }

//     public static void main(String args[]){

//     String str = "abcd";
//     printRev(str, str.length()-1);

//     }
// }

// find the first and last occureance of an element in string

// public class recursion_2 {
//     public static int first = -1;
//     public static int last = -1;

//     public static void getIndices(String str, char el, int idx) {
//         if (idx == str.length()) {
//             return;
//         }
//         if (str.charAt(idx) == el) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         getIndices(str, el, idx + 1);
//     }

//     public static void main(String args[]) {
//         String str = "tabcdfghijakkk";
//         char el = 'a';
//         getIndices(str, el, 0);
//         System.out.println("First occurence : " + first);
//         System.out.println("Last occurence : " + last);
//     }
// }

// cheack if an array is sorted 

// public class recursion_2 {
//     public static boolean isSorted(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (arr[idx] < arr[idx + 1]) {
//             return isSorted(arr, idx + 1);
//         } else {
//             return false;
//         }
//     }

//     public static void main(String args[]) {
//         int arr[]= {1,3,1};
//        System.out.println(isSorted(arr, 0));

//     }
// }

// move all 'x' to the end of the string 

public class recursion_2 {
    public static void moveAllx(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllx(str, idx + 1, count, newString);
        } else {
            newString += currChar;
            moveAllx(str, idx + 1, count, newString);
        }

    }

    public static void main(String args[]) {
        String str = "axbcxxd";
        moveAllx(str, 0, 0, " ");

    }
}