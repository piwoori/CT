package PG.level2._77885;

public class PG77885 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                answer[i] = numbers[i] + 1;
            }
            else{
                String binary = "0" + Long.toBinaryString(numbers[i]);

                int index = binary.lastIndexOf("0");

                binary = binary.substring(0, index)
                        + "10"
                        + binary.substring(index + 2);
                
                answer[i] = Long.parseLong(binary, 2);
            }
        }

        return answer;
    }
}