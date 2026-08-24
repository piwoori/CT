package PG.level1._172928;

public class PG172928 {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int x = 0;
        int y = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(i) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            String[] parts = route.split(" ");

            String dir = parts[0];
            int dist = Integer.parseInt(parts[1]);

            int dx = 0;
            int dy = 0;

            switch (dir) {
                case "N" -> dx = -1;
                case "S" -> dx = 1;
                case "W" -> dy = -1;
                case "E" -> dy = 1;
            }

            // 임시 위치
            int nx = x;
            int ny = y;
            boolean possible = true;

            for (int i = 0; i < dist; i++) {
                nx += dx;
                ny += dy;

                if (nx < 0 || nx >= h || ny < 0 || ny >= w) {
                    possible = false;
                    break;
                }

                if (park[nx].charAt(ny) == 'X') {
                    possible = false;
                    break;
                }

            }

            if(possible) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}