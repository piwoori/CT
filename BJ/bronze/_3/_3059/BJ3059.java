package BJ.bronze._3._3059;

import java.util.Scanner;
public class BJ3059 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0;i < T;i++){
            String S = sc.next();
            int sum = 0;
            boolean[] list = new boolean[26];

            for(int j = 0;j < S.length(); j++){
                int index = S.charAt(j) - 'A';
                list[index] = true;
            }

            for(int j = 0;j <26; j++){
                if (!list[j]){
                    sum += (j + 'A');
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
    
}
