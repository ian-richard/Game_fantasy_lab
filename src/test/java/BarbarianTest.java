import Enemy.Enemy;
import Kingdom.Kingdom;
import components.DamageObject;
import Enemy.Enemy;
import components.ProtectionItem;
import components.ProtectionObject;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;


import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian character;
    DamageObject damageObject;
    DamageObject damageObject2;
    ProtectionObject protectionObject;
    ProtectionObject protectionObject2;
    Kingdom kingdomLevel1;
    Enemy enemy1;

    @Before
    public void before(){
        damageObject = new Weapon("Sword", 40);
        damageObject2 = new Weapon("Club", 20);
        protectionObject = new ProtectionItem("Shield", 20);
        protectionObject2 = new ProtectionItem("Tortoise shell", 10);
        character = new Barbarian("Barbarian", 100, damageObject, protectionObject);
        enemy1 = new Enemy("Pirate", 40, damageObject2, protectionObject2);
        kingdomLevel1 = new Kingdom("The North", 1, enemy1);

    }

    @Test
    public void hasDamageObject(){assertEquals(damageObject, character.getDamageObject());}

    @Test
    public void damageItemHasValue(){assertEquals(40,character.getDamageObjectValue() );}

    @Test
    public void hasHealthPoints(){
        assertEquals(100, character.getHealthPoints());
    }

    @Test
    public void updateHealthPoints(){
        character.setHealthPoints(80);
        assertEquals(80, character.getHealthPoints());
    }

    @Test
    public void canTakeKingdom(){
        assertTrue(character.canTakeKingdom(kingdomLevel1));
    }

    @Test
    public void canTakeKingdomHealthAndDamageTest(){
        assertTrue(character.canTakeKingdomHealthAndWeaponTest(kingdomLevel1));
    }

    @Test
    public void TakeKingdom(){
        character.takeKingdom(kingdomLevel1);
        assertEquals(1, character.getRoomCount());
    }

    @Test
    public void hasWarCry(){
            assertEquals("I don't need fireballs when I'm rocking these guns", character.warCry());
        }
    }

    //    @Test
//    public void hasHealthObject(){
//        int result = character.getHealthPoints();
//        assertEquals(100, result);}

//    @Test
//    public void hasHealthObjectLongTest(){
//        assertEquals(100, (long)character.getHealthPoints());}

