package org.tyaa.designpatterns.creational.abstractfactory.bottle;

import org.tyaa.designpatterns.creational.abstractfactory.water.AbstractWater;

public abstract class AbstractBottle
{
    public abstract void interact(AbstractWater water);
}