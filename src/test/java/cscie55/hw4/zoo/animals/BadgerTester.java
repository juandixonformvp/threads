package cscie55.hw4.zoo.animals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;

public class BadgerTester
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Badger(); // default constuctor
    Animal a2 = new Badger(getRandomBetween(10,15)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Badger(2,"BabyBadger"); // using constructor with age and name
    Animal a4 = new Badger(20, "LongLivingBadger", new String[]{"clams","shrimp","oysters","grubs"}); // using ALL params

    @Test
    public void testDefaultBadger(){
        assertEquals(6,a1.getAge());// should return default age
        assertEquals("Badger" ,a1.getName());// should return default name
        assertEquals("crayfish", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testBadgerConstr2(){
        assertTrue(a2.getAge()>=10 && a2.getAge()<=15);// age should fit in this range, as passed to second constructor
        assertEquals("Badger" ,a2.getName());// should return provided name
        assertEquals("crayfish", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testBadgerConstr3(){
        assertEquals(2,a3.getAge());// should return provided age
        assertEquals("BabyBadger" ,a3.getName());// should return provided name
        assertEquals("crayfish", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testBadgerConstr4(){
        assertEquals(20,a4.getAge());// should return provided age
        assertEquals("LongLivingBadger" ,a4.getName());// should return provided name
        assertEquals("clams", a4.getFavoriteFoods().get(0));// should return the menu provided
    }
}
