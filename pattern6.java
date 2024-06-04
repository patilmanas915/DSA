import java.util.Scanner;

public class pattern6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        Integer n = sc.nextInt();
         for(Integer i=1;i<=n;i++){
            for(Integer j=1;j<=n*2-1;j++){
                if((n*2-1)/2+i<j || n-i>=j )
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
         }
    }
}
