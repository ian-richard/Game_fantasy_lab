package components;

public class ProtectionCreature {

    String name;
    Integer creature;
    Integer protectValue;

    public ProtectionCreature(String name, Integer creature, Integer protectValue){
        this.name = name;
        this.creature = creature;
        this.protectValue = protectValue;
    }

    public String getName() {
        return name;
    }

    public Integer getCreature() {
        return creature;
    }

    public Integer getProtectValue() {
        return protectValue;
    }
}
