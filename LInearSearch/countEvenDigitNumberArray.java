package LInearSearch;

public class countEvenDigitNumberArray {

    static int countEvenNumber(int[] arr) {
        if(arr.length == 0)
            return 0;

        int count =0, f;
        for(int i=0;i<arr.length;i++) {
            f=0;
            while(arr[i] > 0) {
                f+=1;
                arr[i]/=10;
            }
            if(f % 2 ==0)
                count+=1;
        }
        return count;
        
    }
    public static void main(String[] args) {
        // int[] arr = {12,345,2,6,7896};
        int[] arr = {18,124,9,1764,98,1};
        System.out.println(countEvenNumber(arr));
        
    }
}
