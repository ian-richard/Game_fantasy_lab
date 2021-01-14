package player;

import components.ProtectionCreature;
import components.Spell;

public class Wizard extends Player {

    Spell spell;
    ProtectionCreature protectionCreature;

    public Wizard(String name, Integer healthPoints, Spell spell,
                   ProtectionCreature protectionCreature){
        super(name, healthPoints);
        this.spell = spell;
        this.protectionCreature = protectionCreature;

    }

    public Spell getSpell(){ return spell;}

    public ProtectionCreature getProtectionCreature(){ return protectionCreature;}


}