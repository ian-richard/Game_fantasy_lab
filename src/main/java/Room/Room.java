package Room;

public class Room {
    String name;
    Integer healthPointsReq;
    Integer attackPointsReq;

    public Room(String name, Integer healthPointsReq, Integer attackPointsReq){
        this.name = name;
        this.healthPointsReq = healthPointsReq;
        this.attackPointsReq = attackPointsReq;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPointsReq() {
        return healthPointsReq;
    }

    public Integer getAttackPointsReq() {
        return attackPointsReq;
    }
}
