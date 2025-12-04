package BJ.silver._4._2331;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ2331 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int P = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A);

        while(true){
            int temp = list.get(list.size()-1);
            int result = 0;

            while(temp != 0){
                result += (int) Math.pow(temp % 10, (double) P);
                temp /= 10;
            }
            if(list.contains(result)){
                int index = list.indexOf(result);
                System.out.println(index);
                break;
            }

            list.add(result);
        }
        sc.close();

    }
}
