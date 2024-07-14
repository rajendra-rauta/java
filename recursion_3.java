
// // print all permutation of a string

// public class recursion_3 {
//     public static void printPerm(String str, String permutation){
//         if(str.length() == 0){
//             System.out.println(permutation);
//             return ;
//         }
//         for(int i=0; i<str.length(); i++){
//             char currChar str.charAt(i);
//             String newStr = str.substring(0, i)+ str.substring(i+1);
//             printPerm(newStr, permutation+currChar);
//         }

//     }

//     public static void main(String args[]) {
//         String str = "abc";
//         printPerm(str, "");

//     }

// }

// count total paths in a maze to move from (0,0) to (n,m)

// public class recursion_3 {
//     public static int countPath(int i, int j, int n, int m){
//         if (i== n || j ==m) {
//             return 0;
//         }
//         if (i== n-1 && j == n-1) {
//             return 1;
            
//         }
//         // move downwards

//         int downPaths =countPath(i+1, j, n, m);

//         // move right 
//         int rightPaths = countPath(i, j+1, n, m);
//         return downPaths+ rightPaths;
//     }

//     public static void main(String args[]) {
//       int n = 3, m= 3;
//      int totalPaths =  countPath( 0, 0, n, m);
//      System.out.println(totalPaths);

//     }

// }



// place tiles of size 1xm in a dloor of size nxm 






public class recursion_3 {
   public static int placeTiles(int n , int m){
    if (n ==m) {
        return 2;
    }
if (n<m) {
    return 1;
}
    // vertically
    int verticaPlace = placeTiles(n-m, m);

    // horizontally 
    int horizontaPlae = placeTiles(n-1, m);
    return verticaPlace + horizontaPlae;
   }

    public static void main(String args[]) {
   int n=4, m=2;
   System.out.println(placeTiles(n, m));

    }

}