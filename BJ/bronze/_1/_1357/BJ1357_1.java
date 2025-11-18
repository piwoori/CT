package BJ.bronze._1._1357;

import java.util.Scanner;
public class BJ1357_1 {
    // StringBuilder 사용 버전
    
    public static int rev(int n){
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        return Integer.parseInt(sb.reverse().toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int result = rev(X) + rev(Y);
        System.out.println(rev(result));
        sc.close();
    }
    
}
