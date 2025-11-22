package BJ.bronze._1._1032;

import java.util.Scanner;
public class BJ1032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String[] list = new String[T];

        for(int i = 0; i < T; i++){
            list[i] = sc.next();
        }
        char[] result = new char[list[0].length()];
        boolean flag = true;

        for(int i = 0; i < list[0].length(); i++){
            for(int j = 1; j < T; j++){
                flag = true;
                if(list[0].charAt(i) != list[j].charAt(i)){
                    flag = false;
                    break;
                }
            }

            if(flag){
                result[i] = list[0].charAt(i);
            }
            else{
                result[i] = '?';
            }
        }

        System.out.println(result);
        sc.close();
    }
}
