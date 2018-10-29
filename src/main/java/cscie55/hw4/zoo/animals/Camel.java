package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.ChewBehavior;
import cscie55.hw4.zoo.iface.Domesticable;

public class Camel extends Animal implements ChewBehavior, Domesticable {


    public Camel() { // when empty constructor called
        this(10); // we fill in first param and pass it to the second constructor
    }

    public Camel(int age){ // when second constructor is called, age only is given.
        this(age, "Camel"); // We fill in default name and pass to third...
    }

    public Camel(int age, String name) { // when third constructor, use params 1 and 2
        this(age, name, new String[]{"hay"}); // and add String[] food and call 4th constructor

    }

    // NOTE: Only NOW do I call super
    public Camel(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
        super(age, name, favoriteFoods);
    }


    @Override
    public String chew(String food) { return "I'm chewing " + food; }

    @Override
    public String domesticate() { return "Come ride me, I'm domesticated!"; }

}
