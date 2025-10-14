package BJ.bronze._3._10987;

import java.util.Scanner;
import java.util.ArrayList;
public class BJ10987 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input = sc.nextLine();
        int sum = 0;

        for(int i = 0;i < input.length(); i++){
            list.add(String.valueOf(input.charAt(i)));
            String ch = list.get(i);
            if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
                sum += 1;
            }
        }

        System.out.println(sum);
    }
    
}
