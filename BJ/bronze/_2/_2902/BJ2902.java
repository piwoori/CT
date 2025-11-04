package BJ.bronze._2._2902;

import java.util.Scanner;
public class BJ2902 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] name = new char[100];
        for (int i = 0; i <string.length(); i++){
            name[i] = string.charAt(i);
        }
        for(int i = 0; i < name.length; i++){
            if(Character.isUpperCase(name[i])){
                System.out.print(name[i]);
            }
        }
        sc.close();
    }
}