package LInearSearch;

public class minimumNumber {
    static int minNumber(int[] arr) {
        if(arr.length == 0)
            return -1;
        
            int min = arr[0];
            for(int i=1;i<arr.length;i++) {
                if(arr[i] < min) 
                    min = arr[i];
            }
            return min;
    }
    public static void main(String[] args) {
        int[] arr = {18, 12,15,2,7,11};
        System.out.println(minNumber(arr ) + " is the minimum number");
    }
    
}
