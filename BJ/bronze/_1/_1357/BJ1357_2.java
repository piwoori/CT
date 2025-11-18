package BJ.bronze._1._1357;

import java.util.Scanner;

public class BJ1357_2 {

    // 나머지 연산자 활용 방법
    public static int rev(int n){
        int result = 0;

        while(n > 0){
            result = result * 10 + n % 10;
            n /= 10;
        }

        return result;
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
