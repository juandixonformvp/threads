package cscie55.hw4.zoo.animals;

import java.util.HashMap;

/**
 * Capybara class
 */

public class Capybara extends Animal {

  private static int age;
  private static String[] favoriteFoods = {};
  private static String name = "";
  private static String spokenSounds = "";
  private static String playingSounds = "";
  private static String type = "";

  /**
   * a hashmap of the animal's initial property values
  */
  private static HashMap<String, String[]> initProp =
    new HashMap<String, String[]>() {{
      put ("age", new String[] {"5"});
      put ("favoriteFoods", new String[] {"grass", "hay"});
      put ("name", new String[] {"Charlie"});
      put ("playingSounds", new String[] {"CLICK!"});
      put ("spokenSounds", new String[] {"moo"});
      put ("type", new String[] {"capybara"});
    }};

  /**
   * default constructor: initializes the animal's properties
   */
  public Capybara () {
    super(age, favoriteFoods, name, playingSounds, spokenSounds, type);
    age = Integer.valueOf(initProp.get("age")[0]);
    favoriteFoods = initProp.get("favoriteFoods");
    name = initProp.get("name")[0];
    spokenSounds = initProp.get("spokenSounds")[0];
    playingSounds = initProp.get("playingSounds")[0];
    type = initProp.get("type")[0];
    super.setProperties(age, favoriteFoods, name, playingSounds, spokenSounds, type);
  }

  /**
   * overloaded constructor: set the individual animal's name and age
   * @param age age of the animal
   * @param name name of the animal
   */
  public Capybara (int age, String name) {
    super(age, favoriteFoods, name, playingSounds, spokenSounds, type);
    age = age;
    favoriteFoods = initProp.get("favoriteFoods");
    name = name;
    spokenSounds = initProp.get("spokenSounds")[0];
    playingSounds = initProp.get("playingSounds")[0];
    type = initProp.get("type")[0];
    super.setProperties(age, favoriteFoods, name, playingSounds, spokenSounds, type);
  }

  /**
   * get the animal's initial property values
   * @return a hashmap of the animal's initial property values
   */
  public HashMap<String, String[]> getInitProp() {
    return initProp;
  }
}
