package PG.level1._250137;

public class PG250137 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;

        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];

        int success = 0;
        int attackIndex = 0;

        int lastTime = attacks[attacks.length - 1][0];

        for(int time = 1; time <= lastTime; time++) {
            if(attackIndex < attacks.length && attacks[attackIndex][0] == time) {
                health -= attacks[attackIndex][1];
                success = 0;

                if(health <= 0) {
                    return -1;
                }

                attackIndex++;
            }
            else{
                health += x;
                success++;

                if(success == t){
                    health += y;
                    success = 0;
                }

                health = Math.min(health, maxHealth);
            }
        }

        return health;
    }
}
