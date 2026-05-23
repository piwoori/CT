package PG.level2._87946;

public class PG87946 {
    int answer = 0;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, int count) {
        answer = Math.max(answer, count);

        for(int i = 0; i < dungeons.length; i++) {

            // 이미 방문
            if(visited[i]) continue;


            // 최소 피로도 부족
            if(fatigue < dungeons[i][0]) continue;

            visited[i] = true;

            dfs(
                fatigue - dungeons[i][1],
                dungeons,
                count + 1
            );

            visited[i] = false;
        }
    }
}
