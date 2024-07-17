// package Dsa;

// class LL {
//     Node head;
//     private int size;

//     LL() {
//         this.size = 0;
//     }

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // add - first, last
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // add-last
//     public void addLast(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node curNode = head;
//         while (curNode.next != null) {
//             curNode = curNode.next;
//         }
//         curNode.next = newNode;
//     }

//     // print
//     public void printList() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         Node curNode = head;
//         while (curNode != null) {
//             System.out.print(curNode.data + " -> ");
//             curNode = curNode.next;
//         }
//         System.out.println("NULL");
//     }

//     // delet first
//     public void deletFirst() {
//         if (head == null) {
//             System.out.println("This is empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }

//     // delet last
//     public void deletLast() {
//         if (head == null) {
//             System.out.println("This list is empty");
//             return;
//         }
//         size--;
//         if (head.next == null) {
//             head = null;
//             return;

//         }
//         Node secondLast = head;
//         Node lastNode = head.next;
//         while (lastNode.next != null) {
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//         secondLast.next = null;
//     }

//     public int getSize() {
//         return size;
//     }

//     public void reverseIterate() {
//         if (head == null || head.next == null) {
//             return;
//         }
//         Node prevNode = head;
//         Node curNode = head.next;

//         while (curNode != null) {
//             Node nexNode = curNode.next;
//             curNode.next = prevNode;

//             // update
//             prevNode = curNode;
//             curNode = nexNode;
//         }
//         head.next = null;
//         head = prevNode;
//     }
//     public Node reverseRecursive(Node head){
//         if (head ==null || head.next== null) {
//             return head;
//         }

//         Node newHead  = reverseRecursive(head.next);
//         head.next.next = head;
//         head.next= null;
//         return newHead;
//     }

//     public static void main(String args[]) {
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("is");
//         list.printList();

//         list.addLast("list");
//         list.printList();

//         list.addFirst("This");
//         list.printList();

//         list.deletFirst();
//         list.printList();

//         list.deletLast();
//         list.printList();

//         list.getSize();
//         System.out.println(list.getSize());
//         list.addFirst("This");
//         System.out.println(list.getSize());


//        list.reverseRecursive(list.head);
//         list.printList();
//     }
// }




 // <------------- packeages are use in this code  ------------->



// // package Dsa;

// // import java.util.*;;
// // class LL {
// // public static void main(String args[]){
// // LinkedList<String> list = new LinkedList<String>();

// // list.addFirst("a");
// // list.addFirst("is");
// // System.out.println(list);

// // list.addFirst("this");

// // list.addLast("list");
// // System.out.println(list);

// // System.out.println(list.size());

// // for(int i=0; i<list.size(); i++){
// // System.out.print(list.get(i) + " -> ");

// // }
// // System.out.println("null");

// // list.remove(3);
// // System.out.println(list);
// // }
// // }







// <============ Most importanr question of lkedlist ============>





// Find the nth node from last ??

