package components;

public class HealItem {

    String name;
    Integer healValue;

    public HealItem(String name, Integer healValue){
        this.name = name;
        this.healValue = healValue;
    }

    public String getName() {
        return name;
    }

    public Integer getHealValue() {
        return healValue;
    }
}
