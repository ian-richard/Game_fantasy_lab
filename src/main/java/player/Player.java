package player;
import java.util.ArrayList;

public abstract class Player {

    private String name;
    private Integer healthPoints;
    private ArrayList<Room> roomList;

    public Player(String name, Integer healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.roomList = new ArrayList<Room>();
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getRoomCount(){ return this.roomList.size();}

    public void addRoom(Room room){this.roomList.add(room);}
}
