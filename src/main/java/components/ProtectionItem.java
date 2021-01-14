package components;

public class ProtectionItem {

    String name;
    Integer item;

    public ProtectionItem(String name, Integer item){
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
