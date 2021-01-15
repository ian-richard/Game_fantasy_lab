package components;

public class ProtectionItem {

    String name;
    Integer item;
    Integer damage;

    public ProtectionItem(String name, Integer item, Integer damage){
        this.name = name;
        this.item = item;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Integer getItem() {
        return item;
    }

    public Integer getDamage() {
        return damage;
    }
}
