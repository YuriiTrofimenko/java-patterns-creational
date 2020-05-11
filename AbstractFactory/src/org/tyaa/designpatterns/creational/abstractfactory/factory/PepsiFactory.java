package org.tyaa.designpatterns.creational.abstractfactory.factory;

import org.tyaa.designpatterns.creational.abstractfactory.bottle.AbstractBottle;
import org.tyaa.designpatterns.creational.abstractfactory.bottle.PepsiBottle;
import org.tyaa.designpatterns.creational.abstractfactory.water.AbstractWater;
import org.tyaa.designpatterns.creational.abstractfactory.water.PepsiWater;

public class PepsiFactory extends AbstractFactory
{
    public AbstractWater CreateWater()
    {
        return new PepsiWater();
    }

    public AbstractBottle CreateBottle()
    {
        return new PepsiBottle();
    }
}

