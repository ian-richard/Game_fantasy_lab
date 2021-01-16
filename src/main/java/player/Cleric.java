package player;

import components.DamageObject;
import components.HealItem;
import components.ProtectionObject;


public class Cleric extends Player {

    HealItem healItem;

    public Cleric(String name, Integer healthPoints, DamageObject damageObject,
                  ProtectionObject protectionObject, HealItem healItem){

        super(name, healthPoints, damageObject, protectionObject);
        this.healItem = healItem;

    }

    public Integer getHealItem(){ return this.healItem.getHealValue();}


}