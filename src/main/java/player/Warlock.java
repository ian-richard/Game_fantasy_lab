package player;

import components.ProtectionCreature;
import components.ProtectionItem;
import components.Spell;
import components.Weapon;

public class Warlock extends Player {

    Spell spell;
    ProtectionCreature protectionCreature;

    public Warlock(String name, Integer healthPoints, Spell spell,
                   ProtectionCreature protectionCreature){
        super(name, healthPoints);
        this.spell = spell;
        this.protectionCreature = protectionCreature;

    }

    public Spell getSpell(){ return spell;}

    public ProtectionCreature getProtectionCreature(){ return protectionCreature;}


}