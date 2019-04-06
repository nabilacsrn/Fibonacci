package no1;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1, t1 = 1, t2 = 1;
        System.out.print("Input : ");
        int in = scan.nextInt();
        
        System.out.println("Output : ");

        while (i <= in)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
}
