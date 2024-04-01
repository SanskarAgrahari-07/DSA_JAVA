package Trees;

public class BasicTree {
    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree();
        // b1.RecInsertNode(5);
        // b1.RecInsertNode(10);
        // b1.RecInsertNode(4);
        // b1.RecInsertNode(15);
        // b1.RecInsertNode(8);
        // b1.RecInsertNode(6);

        b1.insertNode(5);
        b1.insertNode(10);
        b1.insertNode(4);
        b1.insertNode(15);
        b1.insertNode(8);
        b1.insertNode(6);

        b1.printPreorder(b1.root);
        System.out.println();
        b1.printInorder(b1.root);
        System.out.println();
        b1.printPostorder(b1.root);
        System.out.println();

        b1.swapChildren(10);
        b1.printInorder(b1.root);
        System.out.println();

    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {
    Node root;

    public void RecInsertNode(int val) {
        root = RecInsertNodeHelper(root,val);
    }

    private Node RecInsertNodeHelper(Node node, int val) {
        if(node == null) {
            node = new Node(val);
            return node;
        }

        if(val < node.value) {
            node.left = RecInsertNodeHelper(node.left, val);
        }
        else
            node.right = RecInsertNodeHelper(node.right, val);
        
            return node;
    }

    public void insertNode(int val) {
        Node node = new Node(val);
        Node parent = null;
        if(root == null)  {
            root = node;
            return;
        }
        else {
            Node current = root;
            while(current != null) {
                parent = current;
                if(val < current.value) {
                    current = current.left;
                }
                else {
                    current = current.right;
                }
            }
            if(val < parent.value) 
                parent.left = node;
            else 
                parent.right = node;


        }
    }

    public void printInorder(Node node) {
        if(node != null) {
            printInorder(node.left);
            System.out.print(node.value + "->");
            printInorder(node.right);
        }
    }

    public void printPreorder(Node node) {
        if(node != null) {
            System.out.print(node.value + "->");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }

    public void printPostorder(Node node) {
        if(node != null) {
            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.value + "->");
        }
    }

    public void swapChildren(int data) {
        Node node = nodeHelper(root,data);
        if(node ==  null)
            return;

        int temp = node.left.value;
        node.left.value = node.right.value;
        node.right.value = temp;
    }
    

    private Node nodeHelper(Node node, int val) {
        if(node == null || node.value == val)
            return node;

        Node leftNode = nodeHelper(node.left, val);
        if(leftNode != null)
            return leftNode;
        
        return nodeHelper(node.right, val);
    }

    
            
            
}
