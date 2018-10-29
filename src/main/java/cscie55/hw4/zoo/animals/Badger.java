package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.Playable;
import cscie55.hw4.zoo.iface.Speakable;

public class Badger extends Animal implements Playable, Speakable {


    public Badger() { // when empty constructor called
        this(6); // we fill in first param and pass it to the second constructor
    }

    public Badger(int age){ // when second constructor is called, age only is given.
        this(age, "Badger"); // We fill in default name and pass to third...
    }

    public Badger(int age, String name) { // when third constructor, use params 1 and 2
        this(age, name, new String[]{"crayfish"}); // and add String[] food and call 4th constructor

    }

    // NOTE: Only NOW do I call super
    public Badger(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
        super(age, name, favoriteFoods);
    }


    @Override
    public String play() { return "I love badgering"; }

    @Override
    public String speak() { return "badger squeaks"; }

}
