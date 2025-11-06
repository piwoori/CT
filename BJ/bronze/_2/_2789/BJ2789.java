package BJ.bronze._2._2789;
import java.util.Scanner;
public class BJ2789 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] list = new char[100];
        for(int i = 0; i < string.length(); i++){
            list[i] = string.charAt(i);
        }
        for(int i = 0; i < string.length(); i++){
            if (list[i] != 'C' && list[i] != 'A' && list[i] != 'M' && list[i] != 'B' && list[i] != 'R' && list[i] != 'I' && list[i] != 'D' && list[i] != 'G' && list[i] != 'E'){
                System.out.print(list[i]);
            }
        }
        sc.close();
    }
    
}