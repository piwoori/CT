package PG.level2._42888;

import java.util.*;

public class PG42888 {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();

        for(String r : record) {
            String[] parts = r.split(" ");

            String command = parts[0];
            String uid = parts[1];

            if(command.equals("Enter") || command.equals("Change")) {
                map.put(uid, parts[2]);
            }
        }

        List<String> answer = new ArrayList<>();

        for(String r : record) {
            String[] parts = r.split(" ");

            String command = parts[0];
            String uid = parts[1];

            if(command.equals("Enter")) {
                answer.add(map.get(uid) + " 님이 들어왔습니다.");
            }
            else if(command.equals("Leave")) {
                answer.add(map.get(uid) + " 님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[0]);
    }
}
