package PG.level2._42885;

import java.util.Arrays;

public class PG42885 {
    class Solution {
        public int solution(int[] people, int limit) {
            Arrays.sort(people);

            int answer = 0;
            int left = 0;
            int right = people.length - 1;

            while(left <= right) {
                if(people[left] + people[right] <= limit) {
                    left++; // 만약 자리 남으면 가장 가벼운 사람 같이 탐
                }

                right--; // 가장 무거운 사람은 무조건 탐
                answer++;
            }

            return answer;
        }
    }
}
