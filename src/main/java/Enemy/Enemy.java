package Enemy;

import components.DamageObject;
import components.ProtectionObject;
import player.Player;

public class Enemy extends Player {
    public Enemy(String name, Integer healthPoints, DamageObject damageObject,
                 ProtectionObject protectionObject){
        super(name, healthPoints, damageObject, protectionObject);
}}
