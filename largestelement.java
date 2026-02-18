
public class largestelement {
    public static void main(String[] args) {
        int arr[]={10,20,40,4,45,90};
        System.out.println(maxnumber(arr));

    }
    public static int maxnumber(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
