package player;

import components.DamageObject;

import components.ProtectionObject;


public class Dwarf extends Player {

    public Dwarf(String name, Integer healthPoints, DamageObject damageObject,
                   ProtectionObject protectionObject){
        super(name, healthPoints, damageObject, protectionObject);

    }

}