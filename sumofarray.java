import java.util.*;
public class sumofarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("sumof an array : "+ sumofarray(arr, n));
    }
    public static int sumofarray(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}