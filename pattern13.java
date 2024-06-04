import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        Integer n=sc.nextInt();
        for(char i='A';i<'A'+n;i++){
            for(char j='A';j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
       }
    
}