package Basics;

import java.util.Scanner;

public class methods {

    private static Scanner sc = new Scanner(System.in);
    private static int gcd(int a, int b) {
        if(a<b)
            return gcd(b, a);
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    
    private static void fibo() {
        String word = sc.nextLine();
        System.out.println(word);
    }

    public static void main(String[] args) {
        System.out.print("Enter the values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("gcd(a, b) = "+gcd(a,b)+" "+gcd(b, a));
        fibo();
    }
}
