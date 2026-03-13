import java.util.*;
class HalfRevArr {
    public static void main(String[] args) {
        int[] arr ={5, 2, 9, 1, 6, 3,4,2};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n/2, j=n-1; i<j; i++, j--){
            int temp =arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
