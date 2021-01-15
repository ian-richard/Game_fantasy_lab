package components;

public class HealItem {

    String name;
    Integer item;
    Integer healValue;

    public HealItem(String name, Integer item, Integer healValue){
        this.name = name;
        this.item = item;
        this.healValue = healValue;
    }

    public String getName() {
        return name;
    }

    public Integer getItem() {
        return item;
    }

    public Integer getHealValue() {
        return healValue;
    }
}
