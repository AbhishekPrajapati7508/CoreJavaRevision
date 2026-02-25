public class selectionsort {
     public static void main(String[] args) {
        int arr[]={5,4,3,10,8,14};
        selectionSort(arr);
         for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
             int min_index=i;
             for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
             }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
}
