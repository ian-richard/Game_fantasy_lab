package player;

import components.DamageObject;
import components.ProtectionItem;
import components.Weapon;

public class Barbarian extends Player {


    DamageObject damageObject;
    ProtectionItem protectionObject;

    public Barbarian(String name, Integer healthPoints, DamageObject damageObject,
                 ProtectionItem protectionItem){
        super(name, healthPoints);
        this.damageObject = damageObject;
        this.protectionObject = protectionItem;

    }

    public DamageObject getDamageObject(){ return damageObject;}

    public int getDamageObjectValue(){ return this.damageObject.getDamageValue();}

    public ProtectionItem protectionObject(){ return protectionObject;}






}