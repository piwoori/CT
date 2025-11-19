package BJ.bronze._1._11655;

import java.util.Scanner;
import java.util.ArrayList;
public class BJ11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < line.length(); i++){
            list.add(line.charAt(i));
            if(!Character.isLetter(list.get(i))){
                continue;
            }
            int n = (int) list.get(i) + 13;

            if (Character.isUpperCase(list.get(i)) && n > 90){
                n -= 26;
            }

            if (Character.isLowerCase(list.get(i)) && n > 122){
                n -= 26;
            }
            list.set(i,(char) n);
            
        }
        for(char c : list){
            System.out.print(c);
        }
        sc.close();
    }
    
}