package components;

public abstract class DamageObject {
    private String name;
    Integer damage;

    public DamageObject(String name, Integer damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Integer getDamageValue() {
        return damage;
    }

}
