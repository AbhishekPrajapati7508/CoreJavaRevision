public class countevenodd {

    public static void main(String[] args) {
        int arr[]={1,2,5,6,7,9,8};
        countEvenOdd(arr);
    }
    public static void countEvenOdd(int arr[]){
        int countodd=0;
        int counteven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
       }
       System.out.println(countodd);
       System.out.print(counteven);
    }
}