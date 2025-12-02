package BJ.silver._4._1057;

import java.util.Scanner;

public class BJ1057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int J = sc.nextInt();
        int H = sc.nextInt();
        int round = 0;
        while(J != H){
            J = J/2 + J % 2;
            H = H/2 + H % 2;
            round++;
        }
        System.out.println(round);
        sc.close();
    }
}
