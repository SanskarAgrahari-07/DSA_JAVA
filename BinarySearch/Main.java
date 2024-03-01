package BinarySearch;

public class Main {
    static int binarySearch(int[] arr,int target) {
        int s=0;
        int e = arr.length-1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(target > arr[mid]) {
                s = mid+1;
            }
            else if(target < arr[mid]) {
                e  = mid-1;
            }
            else if(target == arr[mid]) {
               return mid;
            }
            
        }
        return -1; 
        
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,15,19,22,28,35};
        int target = 28;
        System.out.println(binarySearch(arr, target));

    }
    
}
