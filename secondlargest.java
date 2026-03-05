import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest number is:"+  (secondmaxnumber(arr)));
    }
    public static int secondmaxnumber(int arr[]){
        int max= Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax =max;
                max=arr[i];
            }
            else if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
        }
        }
        return smax;
    }
    
}
