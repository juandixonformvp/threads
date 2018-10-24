package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.Playable;
import cscie55.hw4.zoo.iface.Speakable;

import java.util.Arrays;

public class Alligator extends Animal implements Playable, Speakable {

    public Alligator() {
        super(10, "Alligator", new String[]{"buffalo"});
    }

    @Override
    public String play() {
        return "grhwl";
    }

    @Override
    public String speak() {
        return "grhwl";
    }

}
