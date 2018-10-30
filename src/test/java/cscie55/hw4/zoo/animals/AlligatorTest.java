package cscie55.hw4.zoo.animals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;

public class AlligatorTest
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Alligator(); // default constuctor
    Animal a2 = new Alligator(getRandomBetween(40,45)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Alligator(1,"BabyGator"); // using constructor with age and name
    Animal a4 = new Alligator(100, "LongLivingGator", new String[]{"deer","fish","birds","boaters"}); // using ALL params

    @Test
    public void testDefaultGator(){
        assertEquals(10,a1.getAge());// should return default age
        assertEquals("Alligator" ,a1.getName());// should return default name
        assertEquals("buffalo", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testGatorConstr2(){
        assertTrue(a2.getAge()>=40 && a2.getAge()<=45);// age should fit in this range, as passed to second constructor
        assertEquals("Alligator" ,a2.getName());// should return provided name
        assertEquals("buffalo", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testGatorConstr3(){
        assertEquals(1,a3.getAge());// should return provided age
        assertEquals("BabyGator" ,a3.getName());// should return provided name
        assertEquals("buffalo", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testGatorConstr4(){
        assertEquals(100,a4.getAge());// should return provided age
        assertEquals("LongLivingGator" ,a4.getName());// should return provided name
        assertEquals("deer", a4.getFavoriteFoods().get(0));// should return the menu provided
    }
}
