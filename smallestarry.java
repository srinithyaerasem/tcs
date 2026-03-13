class smallestarry {
    public static void main(String[] args) {
        int[] arr={2,10,4,5,7,8,1};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
