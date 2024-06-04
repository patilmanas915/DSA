import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println(i);
        for(int k=i-1;k>0;k--){
            for(int j=k-1;j>0;j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
}
