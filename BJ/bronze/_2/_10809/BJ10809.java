package BJ.bronze._2._10809;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int[26];

        for(int i = 0; i < list.length; i++){
            list[i] = -1;
        }

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(list[c - 'a'] == -1){
                list[c - 'a'] = i;
            }
        }

        for(int x : list){
            System.out.print(x + " ");
        }
    }
}
