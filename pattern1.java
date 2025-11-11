import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int row= sc.nextInt();
        /*for(int i=0;i<row;i++){
            for(int j=2*i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
            */

            for(int i=row;i>=1;i--)
            {
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

            // for(int i=1;i<=row;i++){
            //     for(int j=1;j<=row-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int k=1;k<=(2*i-1);k++){
            //         System.out.print("*");
            //     }

            //     System.out.println();
            // }


    }
    
}
