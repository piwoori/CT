package BJ.bronze._5._25314;

import java.util.Scanner;

public class BJ25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number = N / 4;
        for(int i = 0; i < number; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}