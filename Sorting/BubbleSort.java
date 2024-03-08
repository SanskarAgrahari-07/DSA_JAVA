package Sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }


    static int[] bubblesort(int[] arr) {
        boolean swapped = false;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length-i;j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                } 
            }
            if(!swapped) {  //it is false when the array is already sorted
                break;
            }
        } 
        return arr;
    }
}
