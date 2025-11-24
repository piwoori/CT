package BJ.silver._5._1427;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Integer[] list = new Integer[str.length()];
        for(int i = 0; i < str.length(); i++){
            // list[i] = str.charAt(i) - '0';
            list[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(list, Comparator.reverseOrder());

        for(int i : list){
            System.out.print(i);
        }
        sc.close();
    }
}