import java.util.Scanner;

public class reversenumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(reverse(n));

    }
    public static int reverse(int num){
        int temp=num;
        int rev=0;
        while(temp!=0){
            int digit= temp%10;
            temp =temp/10;
            rev=rev*10+digit;
        }
        return rev;
    }
}