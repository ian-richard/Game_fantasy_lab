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

    public HealItem getHealItem(){ return healItem;}

    public int getHealItemValue(){ return this.healItem.getHealValue();}


}