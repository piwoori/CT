package BJ.bronze._2._3040;

import java.util.Scanner;
public class BJ3040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] fake_list = new int[9];
        int fake_num1 = 0, fake_num2 = 0;
        int sum = 0;
        for(int i = 0; i < 9; i++){
            fake_list[i] = sc.nextInt();
            sum += fake_list[i];
        }
        int last = sum - 100;
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 9; j++){
                if(fake_list[i] + fake_list[j] == last){
                    fake_num1 = i;
                    fake_num2 = j;
                }
            }
        }
        for(int i = 0; i <9; i++){
            if(i != fake_num1 && i != fake_num2){
                System.out.println(fake_list[i]);
            }
        }
        sc.close();
    }
    
}
