package PG.level4._42891;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PG42891 {
    static class Food implements Comparable<Food> {
        int idx;
        int time;

        Food(int idx, int time){
            this.idx = idx;
            this.time = time;
        }

        public int compareTo(Food o) {
            return time - o.time;
        }
    }

    public int solution(int[] food_times, long k) {
        long total = 0;

        for(int food : food_times){
            total += food;
        }

        if(total <= k){
            return -1;
        }

        PriorityQueue<Food> pq = new PriorityQueue<>();

        for(int i = 0; i < food_times.length; i++){
            pq.offer(new Food(i + 1, food_times[i]));
        }

        long prev = 0;
        long remain = food_times.length;

        while(!pq.isEmpty()){
            long now = pq.peek().time;

            long spend = (now - prev) * remain;

            if(k >= spend){
                k -= spend;

                prev = now;

                while(!pq.isEmpty() && pq.peek().time == now){
                    pq.poll();
                    remain--;
                }
            }
            else{
                break;
            }
        }

        ArrayList<Food> list = new ArrayList<>(pq);

        list.sort((a, b) -> a.idx - b.idx);

        return list.get((int)(k % remain)).idx;
    }
}
