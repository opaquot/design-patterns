package org.opaquot;

import org.opaquot.fly.FlyWithWings;
import org.opaquot.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck!");
    }
}
