package cscie55.hw4.zoo.animals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;

public class CamelTester
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Camel(); // default constuctor
    Animal a2 = new Camel(getRandomBetween(40,45)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Camel(1,"BabyCamel"); // using constructor with age and name
    Animal a4 = new Camel(70, "LongLivingCamel", new String[]{"straw","parsley","carrots","water"}); // using ALL params

    @Test
    public void testDefaultCamel(){
        assertEquals(10,a1.getAge());// should return default age
        assertEquals("Camel" ,a1.getName());// should return default name
        assertEquals("hay", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testCamelConstr2(){
        assertTrue(a2.getAge()>=40 && a2.getAge()<=45);// age should fit in this range, as passed to second constructor
        assertEquals("Camel" ,a2.getName());// should return provided name
        assertEquals("hay", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testCamelConstr3(){
        assertEquals(1,a3.getAge());// should return provided age
        assertEquals("BabyCamel" ,a3.getName());// should return provided name
        assertEquals("hay", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testCamelConstr4(){
        assertEquals(70,a4.getAge());// should return provided age
        assertEquals("LongLivingCamel" ,a4.getName());// should return provided name
        assertEquals("straw", a4.getFavoriteFoods().get(0));// should return the menu provided
    }
}