package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.Playable;
import cscie55.hw4.zoo.iface.Speakable;

import java.util.HashMap;

/**
 * Aardvark class
 */
public class Aardvark extends Animal implements Speakable, Playable {


    private static String spokenSounds = "";
    private static String playingSounds = "";
    private static String type = "";

    /**
     * a hashmap of the animal's initial property values
     */
    private static HashMap<String, String[]> initProp =
            new HashMap<String, String[]>() {{
                put ("age", new String[] {"1"});
                put ("favoriteFoods", new String[] {"ants", "leaves", "branches"});
                put ("name", new String[] {"Alpha"});
                put ("playingSounds", new String[] {"YAH!"});
                put ("spokenSounds", new String[] {"krchhh"});
                put ("type", new String[] {"aardvark"});
            }};

    /**
     * default constructor: initializes the animal's properties
     */
    public Aardvark () {
        super(Integer.valueOf(initProp.get("age")[0]), initProp.get("name")[0], initProp.get("favoriteFoods"));
        this.spokenSounds = initProp.get("spokenSounds")[0];
        this.playingSounds = initProp.get("playingSounds")[0];
        this.type = initProp.get("type")[0];
    }

    /**
     * overloaded constructor: set the individual animal's name and age
     * @param age age of the animal
     * @param name name of the animal
     */
    public Aardvark (int age, String name) {
        super(age, name, initProp.get("favoriteFoods"));
        this.spokenSounds = initProp.get("spokenSounds")[0];
        this.playingSounds = initProp.get("playingSounds")[0];
        this.type = initProp.get("type")[0];
    }

    /**
     * get the animal's initial property values
     * @return a hashmap of the animal's initial property values
     */
    public HashMap<String, String[]> getInitProp() {
        return initProp;
    }

    @Override
    public String play() {
        return this.getClass().getName()+" in love sound like this:"+this.playingSounds;
    }

    @Override
    public String speak() {
        return this.getClass().getName()+" when they speak say: "+this.spokenSounds;
    }
}
