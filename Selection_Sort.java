import java.util.Scanner;
public class Selection_Sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,t;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                if(a[i] > a[j]){
                t = a[i];
                a[i] = a[j];
                a[j] = t;

            }
        }
    }
            System.out.println("The new array is:");
            for(i=0;i<n;i++) {
                System.out.println(a[i]);
            }
    }
}
