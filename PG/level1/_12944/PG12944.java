package PG.level1._12944;

public class PG12944 {
    public double solution(int[] arr) {
        double sum = 0;

        for(int i : arr){
            sum += i;
        }

        return sum / arr.length;
    }
}
