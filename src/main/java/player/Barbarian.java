package player;

import components.ProtectionItem;
import components.Weapon;

public class Barbarian extends Player {

    Weapon weapon;
    ProtectionItem protectionItem;

    public Barbarian(String name, Integer healthPoints, Weapon weapon,
                 ProtectionItem protectionItem){
        super(name, healthPoints);
        this.weapon = weapon;
        this.protectionItem = protectionItem;

    }

    public Weapon getWeapon(){ return weapon;}

    public ProtectionItem getProtectionItem(){ return protectionItem;}


}