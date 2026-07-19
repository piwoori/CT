package PG.level1._67256;

public class PG67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10; // *
        int right = 12; // #

        for(int num : numbers) {

            if(num == 0){
                num = 11; // 0
            }

            if(num == 1 || num == 4 || num == 7){
                answer.append("L");
                left = num;
            }
            else if(num == 3 || num == 6 || num == 9){
                answer.append("R");
                right = num;
            }
            else{
                int leftDist = Math.abs(left - num) / 3 +
                        Math.abs(left - num) % 3;

                int rightDist = Math.abs(right- num) / 3 +
                        Math.abs(right - num) % 3;

                if(leftDist < rightDist){
                    answer.append("L");
                    left = num;
                }
                else if(rightDist < leftDist){
                    answer.append("R");
                    right = num;
                }
                else{
                    if(hand.equals("right")){
                        answer.append("R");
                        right = num;
                    }
                    else{
                        answer.append("L");
                        left = num;
                    }
                }
            }
        }

        return answer.toString();
    }
}
