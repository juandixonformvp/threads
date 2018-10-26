package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.Playable;
import cscie55.hw4.zoo.iface.Speakable;

public class Alligator extends Animal implements Playable, Speakable {


    public Alligator() { // when empty constructor called
        this(10); // we fill in first param and pass it to the second constructor
    }

    public Alligator(int age){ // when second constructor is called, age only is given.
        this(age, "Alligator"); // We fill in default name and pass to third...
    }

    public Alligator(int age, String name) { // when third constructor, use params 1 and 2
        this(age, name, new String[]{"buffalo"}); // and add String[] food and call 4th constructor

    }

    // NOTE: Only NOW do I call super
    public Alligator(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
        super(age, name, favoriteFoods);
    }


    @Override
    public String play() { return "grhwl playing"; }

    @Override
    public String speak() { return "grhwl speaking"; }

}
