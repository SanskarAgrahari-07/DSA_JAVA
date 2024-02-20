package Arrays;

import java.util.*;

public class BasicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {3,4,5,6};
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
            arr[i][j] = sc.nextInt();
        }
        }

        for(int[] a : arr) {
        System.out.println(Arrays.toString(a));
        }
        

      
    }
  
}
