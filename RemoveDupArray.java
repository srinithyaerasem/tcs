import java.util.*;
class RemoveDupArray {
    public static void main(String[] args) {
        int[] arr ={4,2,5,2,3,4,1,5}; // 1 2 4 5 8
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        
        for(int num: arr){
            set.add(num);
        }
        for(int num : set){
            System.out.print(num + " ");
        }
        
    }
}
