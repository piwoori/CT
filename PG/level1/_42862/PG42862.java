package PG.level1._42862;

import java.util.*;

public class PG42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌이 있지만 잃어버린 학생
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; i++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        int answer = n - lost.length;

        // 체육복 빌리기
        for(int i = 0; i < lost.length; i++){
            if(lost[i] == -1){
                answer++;
                continue;
            }

            for(int j = 0; j < reserve.length; j++){
                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
