package org.tyaa.designpatterns.creational.abstractfactory.bottle;

import org.tyaa.designpatterns.creational.abstractfactory.water.AbstractWater;

public class CocaColaBottle extends AbstractBottle
{
    public void interact(AbstractWater water)
    {
        System.out.println(this + " interacts with " + water);
    }
}
