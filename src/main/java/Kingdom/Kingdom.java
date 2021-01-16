package Kingdom;

import Enemy.Enemy;
import player.Player;

public class Kingdom {
    public Enemy enemy;
    String name;
    int difficulty;



    public Kingdom(String name, int difficulty, Enemy enemy){
        this.name = name;
        this.difficulty = difficulty;
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
