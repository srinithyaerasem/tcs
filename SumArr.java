import java.util.*;
class SumArr {
    public static void main(String[] args) {
        int[] arr ={5, 2, 9, 1, 6, 3,4,2};
        int n=arr.length;
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        
    }
}
