public class missingnumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        System.out.println("missing number is : " +missing(arr));

    }
    public static int missing(int arr[]){
        int sum=0;
        int n= arr.length+1;
        int nsum=0;
        nsum=(n*(n+1))/2;
        for(int a:arr){
            sum+=a;
        }
    
        return nsum-sum;
    }
    
}
