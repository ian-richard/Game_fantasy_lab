package player;
import Room.Room;
import components.DamageObject;
import components.ProtectionObject;

import java.util.ArrayList;


public abstract class Player {

    private String name;
    private Integer healthPoints;
    DamageObject damageObject;
    ProtectionObject protectionObject;
    private ArrayList<Room> roomList;


    public Player(String name, Integer healthPoints, DamageObject damageObject,
                  ProtectionObject protectionObject){
        this.name = name;
        this.healthPoints = healthPoints;
        this.damageObject = damageObject;
        this.protectionObject = protectionObject;
        this.roomList = new ArrayList<Room>();
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int num){
        this.healthPoints = num;
    }

    public DamageObject getDamageObject(){ return damageObject;}

    public int getDamageObjectValue(){ return this.damageObject.getDamageValue();}

    public ProtectionObject protectionObject(){ return protectionObject;}

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getRoomCount(){ return this.roomList.size();}

    public void addRoom(Room room){this.roomList.add(room);}

    public boolean canAttackRoom(Player player, Room room){
        return (player.healthPoints > room.getHealthPointsReq());}

}
