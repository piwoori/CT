package PG.level1._42889;

import java.util.*;

public class PG42889 {
    public int[] solution(int N, int[] stages){
        int[] answer= new int[N];

        int players = stages.length;

        List<Stage> list = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            int count = 0;

            for(int stage : stages){
                if(stage == i){
                    count++;
                }
            }

            double failRate = 0;

            if(players > 0){
                failRate = (double) count / players;
            }

            list.add(new Stage(i, failRate));

            players -= count;
        }

        Collections.sort(list, (a, b) ->{
            if(b.failRate == a.failRate){
                return a.num - b.num;
            }

            return Double.compare(b.failRate, a.failRate);
        });

        for(int i = 0; i < N; i++){
            answer[i] = list.get(i).num;
        }

        return answer;
    }

    static class Stage{
        int num;
        double failRate;

        Stage(int num, double failRate){
            this.num = num;
            this.failRate = failRate;
        }
    }
}
