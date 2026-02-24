package BJ.bronze._2._3052;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int x = Integer.parseInt(br.readLine());
            int num = x % 42;
            if (list.contains(num)){
                continue;
            }
            else{
                list.add(num);
            }
        }
        System.out.println(list.size());
    }
}
