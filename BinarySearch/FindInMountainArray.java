package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr ,int target) {
        int peak = searchPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        else {
            return binarySearch(arr, target, (peak+1), arr.length-1 );
        }
    }

    static int searchPeak(int[] arr) {
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


    static int binarySearch(int[] arr, int target,int start,int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(target == arr[mid])
                return mid;

            //for Ascending order of the elements
            if(isAsc) {
                if(target > arr[mid])
                    start = mid+1;

                if(target < arr[mid])
                    end = mid-1;
            }
            //for descending order of the elements
            else {
                if(target > arr[mid])
                    end = mid-1;

                if(target < arr[mid])
                    start = mid+1;
            }

        }
        return -1;   // Returns -1 if the element is not found
    }
}
