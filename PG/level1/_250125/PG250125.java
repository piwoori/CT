package PG.level1._250125;

public class PG250125 {
    public int solution(String[][] board, int h, int w){
        int answer = 0;

        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, -1, 1};

        String color = board[h][w];

        for(int i = 0; i < 4; i++){
            int nh = h + dh[i];
            int nw = w + dw[i];

            if(nh >= 0 && nh < board.length && nw >= 0 && nw < board[0].length){
                if(board[nh][nw].equals(color)){
                    answer++;
                }
            }
        }

        return answer;
    }
}
