package Trees;

import java.util.NoSuchElementException;

public class BinarySearchTree {
    private class  Node {
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        b1.insertNode(8);
        b1.insertNode(5);
        b1.insertNode(15);
        b1.insertNode(2);
        b1.insertNode(9);
        b1.insertNode(4);
        System.out.println("Root Node: " + b1.root.value);
        b1.displayInorder(b1.root);
        System.out.println("End");
        b1.displayPreOrder(b1.root);
        System.out.println("End");
        b1.displayPostOrder(b1.root);
        System.out.println("End");
        if(b1.search(110))
            System.out.println("value found");
        else {
            System.out.println("value not found");
        }
        System.out.println("The total number of external nodes is " + b1.countExternalNode());
        System.out.println("The total number of internal nodes is " + b1.countInternalNode());
        System.out.println("The height of the Binary Tree is " + b1.maxHeight());
        System.out.println("The level of 15 is "+ b1.findLevel(15));
        System.out.println("The minimum element of the tree is " + b1.minNode(b1.root));
        System.out.println("The maximum element of the tree is " + b1.maxNode());
        System.out.println("The total number of node is " + (b1.countExternalNode()+b1.countInternalNode()));
        // b1.printNodes();
        b1.root = b1.deleteNode(8);
        System.out.println("Root Node: " + b1.root.value);
        b1.displayInorder(b1.root);
        System.out.println("End");
        Node prec = b1.getPredecessor(4);
        System.out.println("The predecessor of 4 is " + prec.value);

    }

    Node root;
    BinarySearchTree() {

    }
   

    public int getHeight(Node node) {
        if(node == null)
            return -1;

        return node.height;
    }

    public void insertNode(int value) {
        root = insertNode(root,value);
    }

    private Node insertNode(Node node, int value) {
        if(node == null) {
            node = new Node(value);
            return node;
        }
        if(value < node.value) {
           node.left =  insertNode(node.left, value);
        }
        if(value > node.value){
            node.right = insertNode(node.right, value);
        }
            return node;

    }

    public void displayPostOrder(Node node) {
        if(node != null) {
            displayInorder(node.left);
            displayInorder(node.right);
            System.out.print(node.value + "-");
           
        }
    }

    public void displayPreOrder(Node node) {
        if(node != null) {
            System.out.print(node.value + "-");
            displayInorder(node.left);
            displayInorder(node.right);
           
        }
    }

    public void displayInorder(Node node) {
        if(node != null) {
            displayInorder(node.left);
            System.out.print(node.value + "-");
            displayInorder(node.right);
           
        }
    }

    public boolean balanced() {
        return balanced(root);
    }
    
    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    

    public boolean search(int value) {
        boolean x = search(root,value);
        return x;
    }

    private boolean search(Node node, int value) {
        if(node == null )
            return false;
        if(node.value == value)
            return true;
        if(value < node.left.value) 
            return search(node.left , value);
        else
            return search(node.right , value);
    }

    public int countExternalNode() {
        return countExternalNode(root);
    }
    private int countExternalNode(Node node){
        if(node == null) 
            return 0;
        if(node.left == null && node.right == null)
            return 1;
        return countExternalNode(node.left)+countExternalNode(node.right);
    }

    public int countInternalNode() {
        return countInternalNode(root);
    }
    private int countInternalNode(Node node) {
        if(node == null)
            return 0;
        if(node.left == null && node.right == null)
            return 0;
        return 1+countInternalNode(node.left)+countInternalNode(node.right);
    }
    public int maxHeight() {
        return maxHeight(root);
    }
    private int maxHeight(Node node) {
        if(node == null) 
            return 0;
        
        int ldepth = maxHeight(node.left);
        int rdepth = maxHeight(node.right);
        if(ldepth < rdepth)
            return(rdepth + 1);
        else
            return(ldepth+1);
    }

    public int findLevel(int value) {
        return findLevel(root,value);
    }
    private int findLevel(Node node, int value) {
        if(node == null)
            return -1;
        else if(node.value == value) 
            return 0;
        else if(value < node.value)
            return 1+findLevel(node.left, value);
        else 
            return (1+findLevel(node.right, value));
    }

    public int minNode(Node node) {
        // Node node = root;
        while(node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    public int maxNode() {
        Node node = root;
        while (node.right != null) {
            node = node.right;
        }
        return node.value;
    }

    // public void printNodes() {
    //     Node node = root;
    //     if(node == null)
    //         return;
    //     System.out.println(node.value);
    //     printNodes(node);
    //     if(node.left != null)
    //         printNodes(node.left);
    //     if(node.right != null)
    //         printNodes(node.right);
    // }
    // private void printNodes(Node node) {
        
    //     if(node.left != null)
    //         System.out.println(node.left.value);
    //     if(node.right != null) 
    //         System.out.println(node.right.value);
    // }

    public Node getMinNode(Node node) {
        // Node node = root;
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }
    

    public Node deleteNode( int value) {
        root = deleteNode(root,value);
        return root;
    }
    private Node deleteNode(Node node , int value) {
        Node parent = null;
        while(node!= null && node.value != value) {
            parent = node;

            if(value < node.value) {
                node = node.left;
            }
            else {
                node = node.right;
            }
        }

        if(node == null) {
            return root;
        }
        // case:1->With No Children
        if(node.left == null && node.right == null) {
            if(node != root) {
                if(parent.left == node) {
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
            else {
                root = null;
            }
        }
        // case:2->With two Children
        else if(node.left != null && node.right != null) {
            Node successor = getMinNode(node.right);
            int data = successor.value;
            deleteNode(root, data);
            node.value = data;
        }
        // case:2->With one Children
        else {
            Node child = (node.left != null)? node.left : node.right;
            if(node != root) {
                if(node == parent.left) {
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }
            else {
                root = child;
            }
        }
        return root;
        
    }

    public Node findMaximum(Node node) {
        while(node.right != null) {
            node = node.right;
        }
        return node;
    }
    public Node getPredecessor(int value) {
        Node prec=null;
        return getPredecessor(root,prec,value);
    }
    private Node getPredecessor(Node root, Node prec, int value) {
        if(root == null)
            return prec;
        
        if(value == root.value) {
                if(root.left != null) {
                    return findMaximum(root.left);
                }
        }
        else if(value < root.value) {
           return getPredecessor(root.left, prec, value);
        }
        
        else {
            prec = root;
            return getPredecessor(root.right, prec, value);
        }
        return prec;
    }
   

        
}
