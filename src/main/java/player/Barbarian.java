package player;

import components.DamageObject;

import components.HealItem;
import components.ProtectionObject;


public class Barbarian extends Player implements IWarCry{

    public Barbarian(String name, int healthPoints, DamageObject damageObject,
                  ProtectionObject protectionObject){
        super(name, healthPoints, damageObject, protectionObject);
    }

    public String warCry(){
        return "I don't need fireballs when I'm rocking these guns";}


}