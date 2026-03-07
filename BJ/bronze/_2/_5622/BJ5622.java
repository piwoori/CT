package BJ.bronze._2._5622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ5622 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char value = s.charAt(i);
            if('A' <= value && value <= 'C'){
                count += 3;
            }
            else if('D' <= value && value <= 'F'){
                count += 4;
            }
            else if('G' <= value && value <= 'I'){
                count += 5;
            }
            else if('J' <= value && value <= 'L'){
                count += 6;
            }
            else if('M' <= value && value <= 'O'){
                count += 7;
            }
            else if('P' <= value && value <= 'S'){
                count += 8;
            }
            else if('T' <= value && value <= 'V'){
                count += 9;
            }
            else{
                count += 10;
            }
        }
        System.out.println(count);
    }
}
