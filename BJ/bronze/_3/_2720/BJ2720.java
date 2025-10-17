package BJ.bronze._3._2720;

import java.util.Scanner;
public class BJ2720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int C = sc.nextInt();
            int Quarter = C / 25;
            int Dime = (C - (Quarter * 25) ) / 10;
            int Nickel = (C - (Quarter * 25) - (Dime * 10)) / 5;
            int Penny = (C - (Quarter * 25) - (Dime * 10) - (Nickel * 5)) / 1;
            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }
        sc.close();
    }
    
}
