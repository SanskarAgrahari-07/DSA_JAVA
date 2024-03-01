package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,4,3,2};
        int ans = searchMax(arr);
        System.out.println(ans);
    }
    static int searchMax(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                end = mid;
            }
           else {
                start = mid + 1;
            }
        }
        return start;

    }
    
}
