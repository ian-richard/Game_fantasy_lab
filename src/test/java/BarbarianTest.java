import components.DamageObject;
import components.ProtectionItem;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;

import static java.lang.Integer.valueOf;
import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian character;
    DamageObject damageObject;
    ProtectionItem protectionItem;
    Integer healthPoints;

    @Before
    public void before(){
        damageObject = new Weapon("Sword", 40);
        character = new Barbarian("Barbarian", 100, damageObject, protectionItem);

    }

    @Test
    public void hasDamageObject(){assertEquals(damageObject, character.getDamageObject());}

    @Test
    public void damageItemHasValue(){assertEquals(40,character.getDamageObjectValue() );}

    @Test
    public void hasHealthObject(){
        int result = character.getHealthPoints();
        assertEquals(100, result);}

    @Test
    public void hasHealthObjectLongTest(){
        assertEquals(100, (long)character.getHealthPoints());}

    @Test
    public void updateHealthPoints(){
        character.setHealthPoints(80);
        assertEquals(80, (long)character.getHealthPoints());
    }
}
