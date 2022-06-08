package Basics;

import java.util.Scanner;

public class conditions_and_loops {
    public static void main(String[] args) {

        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for(i=1; i<=n; i++) {
            for(j=1; j<=n; j++) {
                if(j<=i)
                    System.out.print(i+" ");
                else
                    break;
            }
            System.out.println();
        }
    }
}
