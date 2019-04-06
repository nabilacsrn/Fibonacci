package no1;

import java.util.Scanner;

public class No1 {
    static void reverseFibonacci(int n) 
    { 
        int a[] = new int[n]; 
      
        // assigning first and second elements 
        a[0] = 1; 
        a[1] = 1; 
      
        for (int i = 2; i < n; i++) 
        { 
            a[i] = a[i - 2] + a[i - 1]; 
        } 
      
        for (int i = n - 1; i >= 0; i--)  
        {
            System.out.print(a[i] +" "); 
        } 
    } 
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int in = scan.nextInt();
        reverseFibonacci(in);
    }
}
