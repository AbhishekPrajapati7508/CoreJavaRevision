import java.util.*;
public class inputoutput {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b= sc.nextInt();
        int sum=0;
        sum=a+b;
        System.out.println("Sum of a and b is : "+sum);
    }
}
