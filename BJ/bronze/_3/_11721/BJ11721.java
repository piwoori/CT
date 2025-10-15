package BJ.bronze._3._11721;

import java.util.Scanner;
public class BJ11721 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        for(int i = 0; i < word.length(); i += 10 ){
            int end = Math.min(i + 10, word.length());
            System.out.println(word.substring(i, end));
        }

        sc.close();
    }
    
}