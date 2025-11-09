package BJ.bronze._2._2484;

import java.util.*;
public class BJ2484 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxprize = 0;

        for (int t = 0; t < N; t++){
            int[] dice = new int[4];
            int[] cnt = new int[7];

            for (int i = 0; i < 4; i++){
                dice[i] = sc.nextInt();
                cnt[dice[i]]++;
            }

            int prize = 0;
            List<Integer> pairs = new ArrayList<>();

            for (int i = 1; i < 7; i++){
                if (cnt[i] == 4){
                    prize = 50000 + i * 5000;
                }
                else if (cnt[i] == 3){
                    prize = 10000 + i * 1000;
                }
                else if (cnt[i] == 2){
                    pairs.add(i);
                }
            }

            if (prize == 0) {
                if (pairs.size() == 2) {
                    prize = 2000 + pairs.get(0) * 500 + pairs.get(1) * 500;
                } else if (pairs.size() == 1) {
                    prize = 1000 + pairs.get(0) * 100;
                } else {
                    int maxValue = 0;
                    for (int x : dice){
                        maxValue = Math.max(maxValue, x);
                    }
                    prize = maxValue * 100;
                }
            }

            maxprize = Math.max(prize, maxprize);
        }
        System.out.println(maxprize);
        sc.close();
            
    }
}
