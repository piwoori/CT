package BJ.bronze._3._10953;

import java.util.Scanner;
public class BJ10953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 쉼표와 공백 모두를 구분자로 이용
        sc.useDelimiter("[,\\s]+");

        for (int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
        sc.close();
    }
    
}
