package BJ.bronze._2._9243;

import java.util.Scanner;
import java.util.Arrays;
public class BJ9243 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        String output = sc.nextLine();

        char[] list = new char[input.length()];
        char[] result = new char[output.length()];

        for(int i = 0; i < input.length(); i++){
            list[i] = input.charAt(i);
            result[i] = output.charAt(i);
        }

        if(input.length() % 2 == 1){
            for (int j = 0; j < list.length; j++){
                if(list[j] == '0'){
                    list[j] = '1';
                }
                else if(list[j] == '1'){
                    list[j] = '0';
                }
            }
        }

        System.out.println(Arrays.equals(list, result) ? "Deletion succeeded" : "Deletion failed");
        sc.close();
    }
}
