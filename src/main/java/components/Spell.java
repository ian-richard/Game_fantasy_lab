package components;

public class Spell {
    String name;
    Integer spell;

    public Spell(String name, Integer spell){
        this.name = name;
        this.spell = spell;
    }

    public String getName() {
        return name;
    }

    public Integer getSpell() {
        return spell;
    }
}
