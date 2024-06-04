import java.util.Scanner;

public class pattern15 {
      public static void main(String[] args) {
       
        Integer n = 5;
        for (Integer i = 0; i <= n; i++) {
            for (Integer j = 0; j <= i; j++)
                System.out.print((char)((int)('A'+i))+" ");
            System.out.println();
        }
    }  
    
}
