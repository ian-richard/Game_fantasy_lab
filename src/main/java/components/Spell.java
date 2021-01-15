package components;

public class Spell {
    String name;
    Integer spell;
    Integer protectValue;

    public Spell(String name, Integer spell, Integer protectValue){
        this.name = name;
        this.spell = spell;
        this.protectValue = protectValue;
    }

    public String getName() {
        return name;
    }

    public Integer getSpell() {
        return spell;
    }

    public Integer getProtectValue() {
        return protectValue;
    }
}
