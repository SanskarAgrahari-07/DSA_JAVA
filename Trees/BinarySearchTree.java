package Trees;

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
        if(b1.search(110))
            System.out.println("value found");
        else {
            System.out.println("value not found");
        }
        System.out.println("The total number of external nodes is " + b1.countExternalNode());
        System.out.println("The total number of internal nodes is " + b1.countInternalNode());
        System.out.println("The height of the Binary Tree is " + b1.maxHeight());
        System.out.println("The level of 15 is "+ b1.findLevel(15));

        // int[] nums = {1,2,3,4,5,6,7,8};
        // b1.populateSorted(nums);
        // System.out.println("Root Node: " + b1.root.value);
        // b1.displayInorder(b1.root);
        // System.out.println("End");
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

    public void populateSorted(int[] nums) {
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        insertNode(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
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

        
}

    
        

   
        
