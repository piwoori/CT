package BJ.bronze._4._10808;

import java.util.Scanner;
public class BJ10808 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int [] count = new int[26];

        // 각 문자 카운트
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            count[ch - 'a']++; 
        }
       
        // 결과 출력    
        for(int j = 0; j < 26; j++){
            System.out.print(count[j] + " ");
        }
        
        sc.close();
        }
    }