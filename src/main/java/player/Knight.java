package player;

import components.DamageObject;

import components.ProtectionObject;


public class Knight extends Player {

    public Knight(String name, Integer healthPoints, DamageObject damageObject,
                 ProtectionObject protectionObject){
        super(name, healthPoints, damageObject, protectionObject);

    }


}