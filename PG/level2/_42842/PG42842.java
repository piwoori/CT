package PG.level2._42842;

public class PG42842 {

    public int[] solution(int brown, int yellow) {
        int[] arr = new int[2];

        for(int i = 1; i <= yellow; i++) {
            int x = i + 2;
            int y = (yellow / i) + 2;

            if((x * y) - yellow == brown && x >= y) {
                arr[0] = x;
                arr[1] = y;
                break;
            }
        }
        return arr;
    }
}
