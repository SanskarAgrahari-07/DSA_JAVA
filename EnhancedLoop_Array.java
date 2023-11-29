import java.util.*;
public class EnhancedLoop_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element");
        int key = sc.nextInt();
        for(int i=0;i<n;i++) {
            if(key == arr[i])
                System.out.println("The key element is at "+ (i+1) + " position.");

        }

    }
    
}
