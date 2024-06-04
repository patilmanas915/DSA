import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        Integer n = sc.nextInt();
        for (Integer i = 1; i <= n; i++) {
            for (Integer j = n; j >= i; j--)
                System.out.print(n-(j-1));
            System.out.println();
        }
    }
}
