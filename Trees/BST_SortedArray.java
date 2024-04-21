package Trees;

public class BST_SortedArray {
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
        BST_SortedArray b1= new BST_SortedArray();
        
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        b1.populateSorted(nums);
        System.out.println("Root Node: " + b1.root.value);
        b1.displayInorder(b1.root);
        System.out.println("End");
        if(b1.balanced()){
            System.out.println("Tree is balanced");
        }
        else {
            System.out.println("Tree is not balanced");
        }
        System.out.println(b1.getHeight(b1.root));
    }
    Node root;
    BST_SortedArray() {

    }
    public void insertNode(int value) {
        root = insertNode(root,value);
    }
    private Node insertNode(Node node , int value) {
        if(node == null) {
            node = new Node(value);
            return node;
        }
        if(value < node.value) {
            insertNode(node.left, value);
        }
        else if(value > node.value) {
            insertNode(node.right, value);
        }
        return node;
    }
    public void displayInorder(Node node) {
        if(node!= null) {
            displayInorder(node.left);
            System.out.print(node.value + "-");
            displayInorder(node.right);
        }
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

        public int getHeight(Node node) {
            if(node == null)
                return -1;
    
            return node.height;
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
    
}
