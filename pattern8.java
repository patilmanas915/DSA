import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        Integer N = sc.nextInt();
        for (Integer i = 1; i <= N; i++) {
            for (Integer j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (Integer j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (Integer j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (Integer i = 1; i <= N; i++) {
            for (Integer j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (Integer j = 1; j<=((N-i)*2)+1; j++) {
                System.out.print("*");
            }
            for (Integer j = 1; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        

    }

}
