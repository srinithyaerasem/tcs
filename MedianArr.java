import java.util.*;
class MedianArr {
    public static void main(String[] args) {
        int[] arr ={5,4,8,2,1}; // 1 2 4 5 8
        int n= arr.length;
        Arrays.sort(arr);
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        // }
        int median = arr[n/2];
        System.out.println(median);
    }
}
