import java.util.*;
class InsertAtPS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] narr = new int[arr.length+1]; 
        int ps=2;
        int value=10;
        for(int i=0;i<narr.length;i++){
            if(i<ps-1){
                narr[i]=arr[i]; //
            }
            else if(i==ps-1){
                narr[i]=value;
            }else{
                
                narr[i]=arr[i-1];
            }
        }
        System.out.println(Arrays.toString(narr));
    }
}

// Insert at start
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] narr = new int[arr.length+1]; 
        narr[0]= 10;
        for(int i=0;i<arr.length;i++){
            narr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(narr));
    }
}



// insert at end
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] narr = new int[arr.length+1]; 
        narr[arr.length]= 10;
        for(int i=0;i<arr.length;i++){
            narr[i]=arr[i];
        }
        System.out.println(Arrays.toString(narr));
    }
}
