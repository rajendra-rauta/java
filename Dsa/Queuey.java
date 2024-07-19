// package Dsa;

// public class Queuey {
//     static class Queue {
//         static int arr[];
//         static int size ;
//         static int rear = -1;
//         static int front = -1;

//         Queue(int n ){
//             arr = new int[n];
//             this.size = n;
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public static boolean isFull() {
//             return (rear+1) % size == front;
//         }
//         // enqueue
//         public static void add(int data){
//             if (isFull()) {
//                 System.out.println("full queue");
//                 return ;

//             }
//             // first element add
//             if (front == -1) {
//                 front= 0;

//             }
//             rear = (rear +1) %size;
//             arr[rear] = data;
//         }

//         // dequeue
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int result = arr[front];
//            if (rear == front) {
//             rear = front = -1;
//            }
//            else{
//             front = (front +1) % size;
//            }
//             return result;
//         }

//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//          return arr[front];
//         }

//     }

//     public static void main(String args[]){
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         System.out.println(q.remove());
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// implimintation of queue using linked list

// package Dsa;

// public class Queuey {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         // enqueue
//         public void add(int data) {
//             Node newNode = new Node(data);
//             if (tail == null) {
//                 tail = head = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;

//         }

//         // dequeue
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front = head.data;
//             if (head == tail) {
//                 tail = null;
//             }
//             head = head.next;
//             return front;
//         }

//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return head.data;
//         }

//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// // using java freamwork

// package Dsa;

// import java.util.*;;

// public class Queuey {

//     public static void main(String args[]) {
//         // Queue<Integer> q = LinkedList<>();
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// <------------- Question  ------------->

package Dsa;

import java.util.*;;

public class Queuey {
    static class Queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        return s1.isEmpty() ;
    }
    public static void add(int data){
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
            
        }
        s1.push(data);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
            
        }
    }
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return s1.pop();
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return s1.peek();
    }
    }

    public static void main(String args[]) {
        // Queue<Integer> q = LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
