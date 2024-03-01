package BinarySearch;

public class PositionInfiniteArray {

    static int range(int[] arr, int target) {
        int start =0;
        int end = 1;
        
        while(target > arr[end]) {
           start = end + 1;
            end = (end * 2) + 3;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr,int target,int start, int end) {
        while(start <= end) {
            int mid = start + (end - start ) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid-1;
            }
            else {
               return mid;
            }
            
        }
        return -1; 
        
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,13,15,17,20,22,30};
        int target = 20;
        int ans = range(arr, target);
        if(ans == -1) {
            System.out.println(target + " is not in the array");
        }
        else {

            System.out.println(target + " is found in " + ans + " position.");
        }

    }
    
}
