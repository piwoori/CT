package PG.level2._92341;

import java.util.*;

public class PG92341 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> totalTime = new HashMap<>();

        for(String record : records) {
            String[] parts = record.split(" ");

            String time = parts[0];
            String car = parts[1];
            String type = parts[2];

            int minute = toMinute(time);

            if(type.equals("IN")){
                inTime.put(car, minute);
            }
            else{
                int start = inTime.get(car);
                int parkingTime = minute - start;

                totalTime.put(
                        car,
                        totalTime.getOrDefault(car, 0) + parkingTime
                );

                inTime.remove(car);
            }
        }

        int lastTime = toMinute("23:59");

        for(String car : inTime.keySet()) {
            int parkingTime = lastTime - inTime.get(car);

            totalTime.put(
                    car,
                    totalTime.getOrDefault(car, 0) + parkingTime
            );
        }

        List<String> cars = new ArrayList<>(totalTime.keySet());
        Collections.sort(cars);

        int[] answer = new int[cars.size()];

        for(int i = 0; i < cars.size(); i++) {
            int time = totalTime.get(cars.get(i));

            if(time <= fees[0]){
                answer[i] = fees[1];
            }
            else{
                answer[i] = fees[1]
                        + (int) Math.ceil(
                        (double) (time - fees[0]) / fees[2]
                        ) * fees[3];
            }
        }

        return answer;
    }

    private int toMinute(String time){
        String[] parts = time.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return hour * 60 + minute;
    }
}
