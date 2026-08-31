package PG.level1._340213;

public class PG340213 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = toSecond(video_len);
        int current = toSecond(pos);
        int opStart = toSecond(op_start);
        int opEnd = toSecond(op_end);

        current = skipOpening(current, opStart, opEnd);

        for(String command : commands) {
            if(command.equals("prev")){
                current = Math.max(0, current - 10);
            }
            else{
                current = Math.min(video, current + 10);
            }

            current = skipOpening(current, opStart, opEnd);
        }

        return toTime(current);
    }

    private int toSecond(String time) {
        String[] parts = time.split(":");

        int minute = Integer.parseInt(parts[0]);
        int second = Integer.parseInt(parts[1]);

        return minute * 60 + second;
    }

    private int skipOpening(int current, int opStart, int opEnd) {
        if(current >= opStart && current<= opEnd) {
            return opEnd;
        }

        return current;
    }

    private String toTime(int time) {
        int minute = time / 60;
        int second = time % 60;

        return String.format("%02d:%02d", minute, second);
    }
}
