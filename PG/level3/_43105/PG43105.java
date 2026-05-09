package PG.level3._43105;

public class PG43105 {
    public int solution(int[][] triangle) {
        for(int i = 1; i < triangle.length; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0){
                    triangle[i][j] += triangle[i-1][j];
                }
                else if(j == i){
                    triangle[i][j] += triangle[i-1][j-1];
                }
                else{
                    triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                }

            }
        }

        int answer = 0;
        for(int num : triangle[triangle.length-1]) {
            answer = Math.max(answer, num);
        }

        return answer;
    }
}
