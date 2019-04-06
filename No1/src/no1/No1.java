package no1;

import java.util.Scanner;

public class No1 {
    static int calculateSum(int n) 
    { 
        if (n <= 0) 
           return 0; 
       
        int fibo[]=new int[n+1]; 
        fibo[0] = 0; fibo[1] = 1; 
       
        int sum = fibo[0] + fibo[1]; 
       
        for (int i=2; i<=n; i++) 
        { 
            fibo[i] = fibo[i-1]+fibo[i-2]; 
            sum += fibo[i]; 
        } 
       
        return sum; 
    }
    
    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Input : ");
        int n = show.nextInt();
        System.out.println("Output : \n"+ calculateSum(n)); 
    }
}
