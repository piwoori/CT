package PG.level1._134240;

public class PG134240 {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;

            for(int j = 0; j < count; j++) {
                left.append(i);
            }
        }

        String right =  new StringBuilder(left).reverse().toString();

        return left + "0" + right;
    }
}
