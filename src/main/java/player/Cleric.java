package player;

import components.HealItem;
import components.ProtectionCreature;
import components.Spell;

public class Cleric extends Player {

    HealItem healItem;


    public Cleric(String name, Integer healthPoints, HealItem healItem){
        super(name, healthPoints);
        this.healItem = healItem;

    }

    public HealItem getHealItem(){ return healItem;}



}