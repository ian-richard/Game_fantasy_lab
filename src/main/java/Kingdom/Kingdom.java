package Kingdom;

import Enemy.Enemy;

public class Kingdom {
    String name;
    int difficulty;
    Enemy enemy;


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
