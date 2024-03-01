package LInearSearch;

public class Main {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) 
            return -1;
        
        for(int i=0;i < arr.length; i++) {
            if(arr[i] == target)
               return i;
        }
        return -1;
    }
   
    public static void main(String[] args) {
        int[] arr = {1,4,7,10,14,19};
        int target = 10;
        int index = linearSearch(arr, target);
        System.out.println(target + " is found at index number " + index);

        
        
    }
}
