package BinarySearch;

public class TernarySearch {
    // Function to perform ternary search
    public static int ternarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == target) {
                return mid1;
            }
            if (arr[mid2] == target) {
                return mid2;
            }

            if (target < arr[mid1]) {
                // Search in the left third
                right = mid1 - 1;
            } else if (target > arr[mid2]) {
                // Search in the right third
                left = mid2 + 1;
            } else {
                // Search in the middle third
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        // If element is not present in the array
        return -1;
    }
    
    static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        // Measuring execution time for ternary search
        long startTime = System.nanoTime();
        int resultTernary = ternarySearch(arr, target);
        long endTime = System.nanoTime();
        long durationTernary = endTime - startTime;

        if (resultTernary != -1) {
            System.out.println("Ternary search: Element found at index " + resultTernary + " in " + durationTernary + " nanoseconds");
        } else {
            System.out.println("Ternary search: Element not found in the array");
        }

        // Measuring execution time for binary search
        startTime = System.nanoTime();
        int resultBinary = binarySearch(arr, target);
        endTime = System.nanoTime();
        long durationBinary = endTime - startTime;

        if (resultBinary != -1) {
            System.out.println("Binary search: Element found at index " + resultBinary + " in " + durationBinary + " nanoseconds");
        } else {
            System.out.println("Binary search: Element not found in the array");
        }
    }
}
