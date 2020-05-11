package org.tyaa.designpatterns.creational.abstractfactory;

import org.tyaa.designpatterns.creational.abstractfactory.bottle.AbstractBottle;
import org.tyaa.designpatterns.creational.abstractfactory.factory.AbstractFactory;
import org.tyaa.designpatterns.creational.abstractfactory.water.AbstractWater;

class Client
{
    private AbstractWater water;
    private AbstractBottle bottle;

    public Client(AbstractFactory factory)
    {
        water = factory.CreateWater();
        bottle = factory.CreateBottle();
    }

    public void run()
    {
        bottle.interact(water);
    }
}
