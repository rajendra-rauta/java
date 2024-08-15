public class treereference {
    // Node class representing each node in the binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int x) {
        val = x;
    }
}

// BinarySearchTree class to manage the tree operations
class BinarySearchTree {
    TreeNode root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Method to insert a value into the binary search tree
    void insert(int val) {
        root = insertRec(root, val);
    }

    // Recursive helper method to insert a value into the binary search tree
    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }

    // Method to perform inorder traversal of the binary search tree
    void inorder() {
        inorderRec(root);
    }

    // Helper method for inorder traversal
    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }

    // Method to search for a value in the binary search tree
    TreeNode search(int val) {
        return searchRec(root, val);
    }

    // Recursive helper method to search for a value
    private TreeNode searchRec(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchRec(root.left, val);
        } else {
            return searchRec(root.right, val);
        }
    }
}

// Main class to demonstrate usage of the binary search tree
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal:");
        bst.inorder();
        System.out.println();

        int searchKey = 70;
        TreeNode result = bst.search(searchKey);
        if (result != null) {
            System.out.println("Found " + searchKey + " in the tree.");
        } else {
            System.out.println(searchKey + " not found in the tree.");
        }    
    }  
}      
 
     
}
