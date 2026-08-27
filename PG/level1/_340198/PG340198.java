package PG.level1._340198;

import java.util.*;

public class PG340198 {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        int row = park.length;
        int col = park[0].length;

        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];

            for(int r = 0; r <= row - size; r++) {
                for(int c = 0; c <= col - size; c++) {

                    boolean possible = true;

                    for(int x = r; x < r + size; x++) {
                        for(int y = c; y < c + size; y++) {
                            if(!park[x][y].equals("-1")) {
                                possible = false;
                                break;
                            }
                        }

                        if(!possible) {
                            break;
                        }
                    }

                    if(possible) {
                        return size;
                    }
                }
            }
        }

        return -1;
    }
}
