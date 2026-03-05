import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armnumber(n));

    }
    public static boolean armnumber(int n){
        int sum=0;
        int digits = String.valueOf(n).length();
        int original = n;
        while(n>0){
           int digit=n%10;
            sum=sum+(int)Math.pow(digit,digits);
            n=n/10;
        }
        // if(sum==original){
        //     return true;
        // }
        // return false;
        return sum==original;
    }

}
