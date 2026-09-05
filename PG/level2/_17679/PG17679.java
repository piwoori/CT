package PG.level2._17679;

public class PG17679 {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];

        for(int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        int answer = 0;

        while(true){
            boolean[][] remove = new boolean[m][n];
            boolean found = false;

            //2 * 2 블록 찾기
            for(int i = 0; i < m - 1; i++) {
                for(int j = 0; j < n - 1; j++) {
                    char c = map[i][j];

                    if(c == ' '){
                        continue;
                    }

                    if(c == map[i][j + 1]
                    && c == map[i + 1][j]
                    && c == map[i + 1][j + 1]){
                        remove[i][j] = true;
                        remove[i][j + 1] = true;
                        remove[i + 1][j] = true;
                        remove[i + 1][j + 1] = true;

                        found = true;
                    }
                }
            }

            if(!found){
                break;
            }

            // 블록 제거
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(remove[i][j]){
                        map[i][j] = ' ';
                        answer++;
                    }
                }
            }

            // 블록 떨어뜨리기
            for(int j = 0; j < n; j++) {
                int bottom = m - 1;

                for(int i = m - 1; i >= 0; i--) {
                    if(map[i][j] != ' '){
                        map[bottom][j] = map[i][j];

                        if(bottom != i){
                            map[i][j] = ' ';
                        }

                        bottom--;
                    }
                }
            }
        }

        return answer;
    }
}
