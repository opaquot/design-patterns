package org.opaquot.decorator;

import org.opaquot.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();
}
