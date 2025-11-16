import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age:  ");
        int age=sc.nextInt();
        
        if(age<18){
            System.out.println("Not Eligible for Voting");
        }
        else
        {
            System.out.println("Eligible for vote");
        }        

    }
    
}
