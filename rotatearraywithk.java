public class rotatearraywithk {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=6;
        rotateright(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateright(int arr[],int k){
        int n=arr.length;
        if(n==0)return;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr,0,k-1);
        reverse(arr, k, n-1);
    }
}

