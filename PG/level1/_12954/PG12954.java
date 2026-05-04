package PG.level1._12954;

public class PG12954 {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        arr[0] = x;

        for(int i = 1; i < n; i++){
            arr[i] = arr[i -1] + x;
        }

        return arr;
    }
}
