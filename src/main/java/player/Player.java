package player;
import Kingdom.Kingdom;
import components.DamageObject;
import components.ProtectionObject;

import java.util.ArrayList;
import java.util.List;


public abstract class Player {

    private String name;
    private int healthPoints;
    DamageObject damageObject;
    ProtectionObject protectionObject;
    private ArrayList<Kingdom> kingdomList;
    private ArrayList<Kingdom> nextKingdomList;
    private Object nextLevel;


    public Player(String name, int healthPoints, DamageObject damageObject,
                  ProtectionObject protectionObject) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damageObject = damageObject;
        this.protectionObject = protectionObject;
        this.kingdomList = new ArrayList<Kingdom>();
        this.nextKingdomList = new ArrayList<Kingdom>();
        this.nextLevel = null;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int num) {
        this.healthPoints = num;
    }

    public DamageObject getDamageObject() {
        return damageObject;
    }

    public int getDamageObjectValue() {
        return this.damageObject.getDamageValue();
    }

    public ProtectionObject protectionObject() {
        return protectionObject;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getRoomCount() {
        return this.kingdomList.size();
    }

    public void addRoom(Kingdom kingdom) {
        this.kingdomList.add(kingdom);
    }

    public boolean canTakeKingdom(Kingdom kingdom) {
        return this.healthPoints > kingdom.enemy.getHealthPoints();
    }

    public boolean canTakeKingdomHealthAndWeaponTest(Kingdom kingdom) {
        return this.healthPoints > kingdom.enemy.getHealthPoints() &&
                this.damageObject.getDamageValue() > kingdom.enemy.getDamageObjectValue();
    }

    public void takeKingdom(Kingdom kingdom) {
        if (canTakeKingdomHealthAndWeaponTest(kingdom)) ;
        {
            addRoom(kingdom);
        }
    }

    public int sizeNextKingdomList() {
        return nextKingdomList.size();
    }

    public void populateNextKingdomList(Kingdom kingdom) {
        this.nextKingdomList.add(kingdom);
    }

    public Kingdom getNextLevel() {
        return (Kingdom)this.nextLevel;
    }

    public void setNextLevel() {
        this.nextLevel = nextKingdomList.remove(0);
    }
}


//
//}
//
//    public void progressToNextLevel(){
//        this.nextLevel = nextKingdomList.iterator().next();
//    }

//    public void progressToNextLevel(){
//        for (int i = 0; i < kingdomList.size(); i++ ){
//            this.nextLevel = nextKingdomList.get(i);
//        }
//    }}


