package cscie55.hw4.zoo.animals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;

public class BearTester
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Bear(); // default constuctor
    Animal a2 = new Bear(getRandomBetween(20,25)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Bear(3,"BabyBear"); // using constructor with age and name
    Animal a4 = new Bear(30, "LongLivingBear", new String[]{"trout","salmon","raspberries","hotdogs"}); // using ALL params

    @Test
    public void testDefaultBear(){
        assertEquals(5,a1.getAge());// should return default age
        assertEquals("Bear" ,a1.getName());// should return default name
        assertEquals("berries", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testBearConstr2(){
        assertTrue(a2.getAge()>=20 && a2.getAge()<=25);// age should fit in this range, as passed to second constructor
        assertEquals("Bear" ,a2.getName());// should return provided name
        assertEquals("berries", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testBearConstr3(){
        assertEquals(3,a3.getAge());// should return provided age
        assertEquals("BabyBear" ,a3.getName());// should return provided name
        assertEquals("berries", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testBearConstr4(){
        assertEquals(30,a4.getAge());// should return provided age
        assertEquals("LongLivingBear" ,a4.getName());// should return provided name
        assertEquals("trout", a4.getFavoriteFoods().get(0));// should return the menu provided
    }
}