package BinarySearch;

public class FloorElement {
    //return the greater number smaller or equal to target
    static int findFloorElement(int[] arr, int target) {
        int s =0;
        int e = arr.length-1;
        if(target < arr[arr.length-1])
            return -1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            
            if(target <= arr[mid]) 
                e = mid-1;
            else
                s = mid + 1;

        }
        return e;

    } 
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target  = 4;
        int ans = findFloorElement(arr, target);
        System.out.println(arr[ans]);
    }
}
