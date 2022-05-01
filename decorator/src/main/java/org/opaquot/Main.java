package org.opaquot;

import org.opaquot.component.Beverage;
import org.opaquot.component.Espresso;
import org.opaquot.component.HouseBlend;
import org.opaquot.decorator.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}