package org.tyaa.designpatterns.creational.abstractfactory.bottle;

import org.tyaa.designpatterns.creational.abstractfactory.water.AbstractWater;

class SpriteBottle extends AbstractBottle
{
  public void interact(AbstractWater water)
  {
    System.out.println(this + " interacts with " + water);
  }
}