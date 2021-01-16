import components.*;
import org.junit.Before;
import org.junit.Test;
import player.Warlock;
import player.Wizard;


import static org.junit.Assert.*;

public class WarlockTest {

    Warlock character;
    DamageObject damageObject;
    ProtectionObject protectionObject;

    @Before
    public void before(){
        damageObject = new Spell("Psychic Scream", 40);
        protectionObject = new ProtectionCreature("Ogre", 40);
        character = new Warlock("Warlock", 100, damageObject, protectionObject );

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
