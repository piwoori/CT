package PG.level3._42628;

import java.util.TreeMap;

public class PG42628 {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(String op : operations) {
            String[] s = op.split(" ");

            String command = s[0];
            int num = Integer.parseInt(s[1]);

            if(command.equals("I")) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            else{
                if(map.isEmpty()){
                    continue;
                }

                int target;

                if(num == 1){
                    target = map.lastKey();
                }
                else{
                    target = map.firstKey();
                }

                if(map.get(target) == 1){
                    map.remove(target);
                }
                else{
                    map.put(target, map.get(target) - 1);
                }
            }
        }

        if(map.isEmpty()){
            return new int[]{0, 0};
        }

        return new int[]{map.lastKey(), map.firstKey()};
    }
}
