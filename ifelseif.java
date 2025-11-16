import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int tmarks=sc.nextInt();
        if(tmarks<33){
            System.out.println("Not Clear the exam");
        }
        else if(tmarks>33 && tmarks<=74){
            System.out.println("clear exam but grade are Below A ");
        }
        else if(tmarks>75 && tmarks<=84){
            System.out.println("Clear exam with First Class (A)");
        }
        else{
            System.out.println("Clear with A+ Grade");
        }
    }
    
}
