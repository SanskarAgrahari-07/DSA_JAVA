package LInearSearch;

public class RichestCustomerWealth {
    static int richestWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=0;j<arr[i].length;j++) {
                sum+=arr[i][j];
            }
            if(sum > ans)
                ans = sum;
        }
        
       return ans;
    }
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(richestWealth(accounts));
    }
    
}
