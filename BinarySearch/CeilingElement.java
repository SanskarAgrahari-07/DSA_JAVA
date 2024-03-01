package BinarySearch;

public class CeilingElement {
    //return the smallest number greater or equal to target
    static int findCeilingElement(int[] arr, int target) {
        if(target > arr[arr.length - 1])
            return -1;
        int s =0;
        int e = arr.length-1;

        while(s <= e) {
            int mid = s + (e-s)/2;
            
            if(target <= arr[mid]) 
                e = mid-1;
            else
                s = mid + 1;

        }
        return s;

    } 
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target  = 4;
        int ans = findCeilingElement(arr, target);
        System.out.println(ans);
    }

    
    
}
