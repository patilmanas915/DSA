import java.util.Scanner;


public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer n=sc.nextInt();
        for(Integer i=n;i>=1;i--){
            for(Integer j=n-i;j>0;j--){
                System.out.print(" ");

            }
            for(Integer j=i*2-1;j>=1;j--)
            {
                System.err.print("*");
            }
            for(Integer j=n-i;j>0;j--){
                System.out.print(" ");

            }
            System.out.println();
        }
    }
    
}
