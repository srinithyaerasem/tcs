import java.util.*;
public class RotateK{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //2
        int n=arr.length;
        for(int i=0;i<k;i++){
            int first = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
