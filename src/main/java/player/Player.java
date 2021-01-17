package player;
import Kingdom.Kingdom;
import components.DamageObject;
import components.ProtectionObject;

import java.util.ArrayList;


public abstract class Player {

    private String name;
    private int healthPoints;
    DamageObject damageObject;
    ProtectionObject protectionObject;
    private ArrayList<Kingdom> kingdomList;


    public Player(String name, int healthPoints, DamageObject damageObject,
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

    public int getHealthPoints() {
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

    public int getRoomCount(){ return this.kingdomList.size();}

    public void addRoom(Kingdom kingdom){this.kingdomList.add(kingdom);}

//    public void canTakeKingdom(Kingdom kingdom){
//        if(this.healthPoints > kingdom.enemy.getHealthPoints()){
//        this.kingdomList.add(kingdom);}

    public boolean canTakeKingdom(Kingdom kingdom){
        return this.healthPoints > kingdom.enemy.getHealthPoints(); }

    public boolean canTakeKingdomHealthAndWeaponTest(Kingdom kingdom){
        return this.healthPoints > kingdom.enemy.getHealthPoints() &&
                this.damageObject.getDamageValue() > kingdom.enemy.getDamageObjectValue(); }

    public void takeKingdom(Kingdom kingdom){
        if (canTakeKingdomHealthAndWeaponTest(kingdom));{
            addRoom(kingdom);
        }
    }
}
