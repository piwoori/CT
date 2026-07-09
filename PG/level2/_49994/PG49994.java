package PG.level2._49994;

import java.util.*;

public class PG49994 {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();

        int x = 0;
        int y = 0;

        for(char c : dirs.toCharArray()) {

            int nx = x;
            int ny = y;

            switch(c) {
                case 'U' : ny++; break;
                case 'D' : ny--; break;
                case 'L' : nx--; break;
                case 'R' : nx++; break;
            }

            if(nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }

            String path = x + "," + y + "," + nx + "," + ny;
            String reverse = nx + "," + ny + "," + x + "," + y;

            if(!set.contains(path)) {
                set.add(path);
                set.add(reverse);
            }

            x = nx;
            y = ny;
        }

        return set.size() / 2;
    }
}
