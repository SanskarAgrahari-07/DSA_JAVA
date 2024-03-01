package BinarySearch;

public class OrderAgnosticBS {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
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
    public static void main(String[] args) {
        int[] arr = {90,75,63,45,22,12,10,2};
        int target = 75;
        System.out.println(binarySearch(arr, target));

        int[] array = {2,4,6,9,12,22,30,42,57};
        int key = 30;
        System.out.println(binarySearch(array, key));
    }
    
}
