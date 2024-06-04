import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        Integer n = sc.nextInt();
        for (Integer i = 1; i <= n; i++) {
            for (Integer j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
