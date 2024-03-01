package BinarySearch;

import java.util.Arrays;

public class FirstLastIndex {
    static int[] index(int[] arr, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);

        return ans;
    }
    
    static int search(int[] arr,int target,boolean startIndex) {
        int ans = -1;
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
            else {
               ans = mid;
               if(startIndex){
                    e = mid-1;
               }
               else
                    s = mid +1;
            }
            
        }
        return ans; 
        
    }
    public static void main(String[] args) {
        int[] arr = {2,7,7,8,8,8,9,10};
        int target = 8;
        arr = index(arr, target);
        System.out.println(Arrays.toString(arr));

    }
    
}
