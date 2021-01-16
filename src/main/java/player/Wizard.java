package player;

import components.DamageObject;
import components.ProtectionItem;
import components.ProtectionObject;


public class Wizard extends Player {

    public Wizard(String name, Integer healthPoints, DamageObject damageObject,
                  ProtectionObject protectionObject){
        super(name, healthPoints, damageObject, protectionObject);


    }


}