package BJ.bronze._5._27866;

import java.util.Scanner;

public class BJ27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = sc.nextInt();
        char[] S = str.toCharArray();
        System.out.println(S[i - 1]);
        sc.close();
    }
}