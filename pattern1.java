

import java.util.Scanner;

class pattern1{
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        Integer n=sc.nextInt();
        for(Integer i=0;i<n;i++){
            for(Integer j=0;j<n;j++)
                System.out.print("*");
            System.out.println();
        }
       }
}