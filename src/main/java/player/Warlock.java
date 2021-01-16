package player;

import components.DamageObject;

import components.ProtectionObject;


public class Warlock extends Player {

    public Warlock(String name, Integer healthPoints, DamageObject damageObject,
                     ProtectionObject protectionObject){
        super(name, healthPoints, damageObject, protectionObject);

    }


}