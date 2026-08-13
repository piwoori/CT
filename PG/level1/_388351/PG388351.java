package PG.level1._340199;

public class PG340199{
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for(int  i = 0; i < schedules.length; i++){

            int limit = toMinute(schedules[i] + 10);
            boolean succes = true;

            for (int j = 0; j < 7;j++){
                int day = (startday - 1+ j)% 7 + 1;

                if (day == 6 || day == 7){
                    continue;
                }

                int arrive = toMinute(timelogs[i][j]);

                if(arrive > limit){
                    succes = false;
                    break;
                }
            }

            if(succes){
                answer++;
            }

        }

        return answer;
    }

    private int toMinute(int time){
        int hour = time/ 60;
        int minute = time % 100;

        return hour * 60 + minute;
    }
}
