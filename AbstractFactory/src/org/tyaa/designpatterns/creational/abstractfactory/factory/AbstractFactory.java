package org.tyaa.designpatterns.creational.abstractfactory.factory;

import org.tyaa.designpatterns.creational.abstractfactory.bottle.AbstractBottle;
import org.tyaa.designpatterns.creational.abstractfactory.water.AbstractWater;

public abstract class AbstractFactory
{
    public abstract AbstractWater CreateWater();
    public abstract AbstractBottle CreateBottle();
}
