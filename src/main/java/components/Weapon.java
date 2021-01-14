package components;

public class Weapon {
    String name;
    Integer weapon;

    public Weapon(String name, Integer weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Integer getWeapon() {
        return weapon;
    }
}
