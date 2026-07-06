package PG.level1._250121;

import java.util.ArrayList;
import java.util.List;

public class PG250121 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = getIndex(ext);
        int sortIdx = getIndex(sort_by);

        List<int[]> list = new ArrayList<>();

        for(int[] row : data) {
            if(row[extIdx] < val_ext) {
                list.add(row);
            }
        }

        list.sort((a, b) -> a[sortIdx] - b[sortIdx]);

        int[][] answer = new int[list.size()][4];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public int getIndex(String s) {
        switch (s){
            case "code" : return 0;
            case "date" : return 1;
            case "maximum" : return 2;
            case "remain" : return 3;
        }

        return -1;
    }
}
