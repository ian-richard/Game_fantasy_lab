package components;

public class Weapon {
    String name;
    Integer weapon;
    Integer damage;

    public Weapon(String name, Integer weapon, Integer damage){
        this.name = name;
        this.weapon = weapon;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Integer getWeapon() {
        return weapon;
    }

    public Integer getDamage() {
        return damage;
    }
}
