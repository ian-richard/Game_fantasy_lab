package components;

public abstract class ProtectionObject {
    String name;
    Integer defenseValue;

    public ProtectionObject(String name, Integer defenseValue){
        this.name = name;
        this.defenseValue = defenseValue;
    }

    public String getName() {
        return name;
    }

    public Integer getDefenseValue() {
        return defenseValue;
    }

}
