import java.util.*;
class RevArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int len=arr.length;
        int[] rev = new int[len];
        for(int i=0;i<len;i++){
            rev[i]=arr[len-i-1];// 0-4 1-3 2-2 3-1 4-0
        }
        
        System.out.println(Arrays.toString(rev));
    }
}
