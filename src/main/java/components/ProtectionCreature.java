package components;

public class ProtectionCreature {

    String name;
    Integer creature;

    public ProtectionCreature(String name, Integer creature){
        this.name = name;
        this.creature = creature;
    }

    public String getName() {
        return name;
    }

    public Integer getCreature() {
        return creature;
    }
}
