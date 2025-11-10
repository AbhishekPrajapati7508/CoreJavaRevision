import java.util.Scanner;
public class forloop {
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.print("Enter the  value of b : ");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");

        }

    }
}
