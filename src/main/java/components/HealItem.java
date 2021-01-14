package components;

public class HealItem {

    String name;
    Integer item;

    public HealItem(String name, Integer item){
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Integer getItem() {
        return item;
    }
}
