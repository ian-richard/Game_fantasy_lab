package player;
import Kingdom.Kingdom;
import components.DamageObject;
import components.ProtectionObject;

import java.util.ArrayList;

import static java.lang.Boolean.TRUE;


public abstract class Player implements IAttack {

    private String name;
    private Integer healthPoints;
    DamageObject damageObject;
    ProtectionObject protectionObject;
    private ArrayList<Kingdom> kingdomList;


    public Player(String name, Integer healthPoints, DamageObject damageObject,
                  ProtectionObject protectionObject){
        this.name = name;
        this.healthPoints = healthPoints;
        this.damageObject = damageObject;
        this.protectionObject = protectionObject;
        this.kingdomList = new ArrayList<Kingdom>();
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

    public Integer getRoomCount(){ return this.kingdomList.size();}

    public void addRoom(Kingdom kingdom){this.kingdomList.add(kingdom);}

    public boolean canTakeKingdom(Kingdom kingdom){
        return TRUE;
    }

}
