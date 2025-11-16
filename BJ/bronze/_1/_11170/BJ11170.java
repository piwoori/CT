package BJ.bronze._1._11170;

import java.util.Scanner;
public class BJ11170 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int  M = sc.nextInt();
            int count = 0;
            for(int j = N; j <= M; j++){
                String num = String.valueOf(j);
                char[] list = new char[num.length()];
                for(int k = 0; k < num.length(); k++){
                    list[k] = num.charAt(k);
                    if(list[k] == '0'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
    
}
