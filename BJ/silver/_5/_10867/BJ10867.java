package BJ.silver._5._10867;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class BJ10867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if(!list.contains(x)) {
                list.add(x);
            }
            else{
                continue;
            }
        }
        Collections.sort(list);
        for(int x : list){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
