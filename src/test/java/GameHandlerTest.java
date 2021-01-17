import Enemy.Enemy;
import GameHandler.GameHandler;
import Kingdom.Kingdom;
import components.DamageObject;
import components.ProtectionItem;
import components.ProtectionObject;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import player.Warlock;

import static org.junit.Assert.assertEquals;

public class GameHandlerTest {
    private GameHandler handler;
    private Barbarian barbarian;
    private Warlock warlock;
    DamageObject damageObject;
    DamageObject damageObject2;
    ProtectionObject protectionObject;
    ProtectionObject protectionObject2;
    Enemy enemy;


    @Before()
    public void before(){
        handler = new GameHandler();
        damageObject = new Weapon("Sword", 40);
        damageObject2 = new Weapon("Club", 20);
        protectionObject = new ProtectionItem("Shield", 20);
        protectionObject2 = new ProtectionItem("Tortoise shell", 10);
        barbarian = new Barbarian("Barbarian", 100, damageObject, protectionObject);
        warlock = new Warlock("Pirate", 40, damageObject2, protectionObject2);
        enemy = new Enemy("Pirate", 40, damageObject2, protectionObject2);

    }

    @Test
    public void WarCryPlayerListStartsEmpty(){
        assertEquals(0, handler.getNumberOfWarCryPlayers());
    }

    @Test
    public void WarCryPlayerList_HasTwo(){
        handler.addItem(barbarian);
        handler.addItem(warlock);
        assertEquals(2, handler.getNumberOfWarCryPlayers());
    }
}
