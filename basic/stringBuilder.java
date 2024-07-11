import java.util.*;

// public class stringBuilder {
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Rajendra");
//         System.out.println(sb);

//         // char at index 0 
//         // System.out.println(sb.charAt(0));

//         // set char at index 0
//       sb.setCharAt(0, 'p');
//       System.out.println(sb);
//       sb.insert(0, 'R');
//       System.out.println(sb.length());


// // delet the extra p 
//         sb.delete(1, 2);
//         System.out.println(sb);
// sb.append(" ");
// sb.append("R");
// sb.append("a");
// sb.append("u");
// sb.append("t");
// sb.append("a");
// System.out.println(sb);


//     }

// }







public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Rajendra");
     

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() -1- i;
            char frontChar = sb.charAt(front);
            char backChar =sb.charAt(back);
      
      
      
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
      
        }
        System.out.println(sb);
   

    }

}
