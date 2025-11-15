package BJ.bronze._1._1157;

import java.util.Scanner;
public class BJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int[] cnt = new int[26];

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            cnt[c - 'A']++;
        }

        int max = -1;
        int maxid = -1;
        boolean duplicate = false;

        for(int i = 0; i < 26; i++){
            if(cnt[i] > max){
                max = cnt[i];
                maxid = i;
                duplicate = false;
            }
            else if(cnt[i] == max){
                duplicate = true;
            }
        }

        if(duplicate){
            System.out.println("?");
        }
        else{
            char result = (char)('A' + maxid);
            System.out.println(result);
        }
        sc.close();
    }
}