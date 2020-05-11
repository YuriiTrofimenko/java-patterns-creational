package org.tyaa.designpatterns.creational.abstractfactory.factory;

import org.tyaa.designpatterns.creational.abstractfactory.bottle.AbstractBottle;
import org.tyaa.designpatterns.creational.abstractfactory.bottle.CocaColaBottle;
import org.tyaa.designpatterns.creational.abstractfactory.water.AbstractWater;
import org.tyaa.designpatterns.creational.abstractfactory.water.CocaColaWater;

public class CocaColaFactory extends AbstractFactory
{
    public AbstractWater CreateWater()
    {
        return new CocaColaWater();
    }

    public AbstractBottle CreateBottle()
    {
        return new CocaColaBottle();
    }
}
