package BinarySearch;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        
        if(pivot == -1) {
            return (binarySearch(arr, target,0,arr.length-1));
        }
        if(arr[pivot] == target) {
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0,pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr,int target, int s, int e) {
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

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start) /2;

            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
