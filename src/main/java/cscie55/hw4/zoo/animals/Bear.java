package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.Learnable;
import cscie55.hw4.zoo.iface.Huggable;

public class Bear extends Animal implements Learnable, Huggable {


    public Bear() { // when empty constructor called
        this(5); // we fill in first param and pass it to the second constructor
    }

    public Bear(int age){ // when second constructor is called, age only is given.
        this(age, "Bear"); // We fill in default name and pass to third...
    }

    public Bear(int age, String name) { // when third constructor, use params 1 and 2
        this(age, name, new String[]{"berries"}); // and add String[] food and call 4th constructor

    }

    // NOTE: Only NOW do I call super
    public Bear(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
        super(age, name, favoriteFoods);
    }


    @Override
    public String learn() { return "I can learn how to ride a unicycle"; }

    @Override
    public String huggable() { return "Give me a bear hug"; }

}
