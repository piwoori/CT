package PG.level1._77484;

import java.util.HashSet;
import java.util.Set;

public class PG77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        Set<Integer> set = new HashSet<>();

        for(int num : win_nums) {
            set.add(num);
        }

        for(int num : lottos) {

            if(num == 0){
                zeroCount++;
            }
            else if(set.contains(num)){
                matchCount++;
            }
        }

        int best = getRank(matchCount + zeroCount);
        int worst = getRank(matchCount);

        return new int[]{best, worst};
    }

    private int getRank(int count){
        switch(count){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
