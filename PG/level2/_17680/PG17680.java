package PG.level2._17680;

import java.util.ArrayList;

public class PG17680 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        ArrayList<String> cache = new ArrayList<>();

        for(String city : cities) {
            city = city.toLowerCase();

            // 캐시 존재
            if(cache.contains(city)) {
                cache.remove(city);
                cache.add(city); // 가장 최근 사용 위치로 이동
                answer += 1;
            }
            // 캐시 미존재
            else {

                if(cacheSize > 0 && cache.size() >= cacheSize) {
                    cache.remove(0);
                }

                if(cacheSize > 0) {
                    cache.add(city);
                }

                answer += 5;
            }
        }
        return answer;
    }
}
