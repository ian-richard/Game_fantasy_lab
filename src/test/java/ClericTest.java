import components.*;
import org.junit.Before;
import org.junit.Test;
import player.Cleric;



import static org.junit.Assert.*;

public class ClericTest {

    Cleric character;
    DamageObject damageObject;
    ProtectionObject protectionObject;
    HealItem healItem;

    @Before
    public void before(){
        damageObject = new Spell("Psychic Scream", 40);
        protectionObject = new ProtectionCreature("Ogre", 40);
        healItem = new HealItem("Potion", 50 );
        character = new Cleric("Cleric", 100, damageObject,
                protectionObject, healItem);

    }

    @Test
    public void hasHealItem(){assertEquals(healItem, character.getHealItem());}

    @Test
    public void hasHealItemValue(){assertEquals(50, (long)character.getHealItem());}

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
