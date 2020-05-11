/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.designpatterns.creational.builder;

import java.util.logging.Logger;

/**
 *
 * @author yurii
 */
public class Program {

    private static final Logger LOGGER =
        Logger.getLogger(Program.class.getName());

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {

    var mage = new Hero.Builder(Profession.MAGE, "Riobard")
        .withHairColor(HairColor.BLACK)
        .withWeapon(Weapon.DAGGER)
        .build();
    LOGGER.info(mage.toString());

    var warrior = new Hero.Builder(Profession.WARRIOR, "Amberjill")
        .withHairColor(HairColor.BLOND)
        .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
        .build();
    LOGGER.info(warrior.toString());

    var thief = new Hero.Builder(Profession.THIEF, "Desmond")
        .withHairType(HairType.BALD)
        .withWeapon(Weapon.BOW)
        .build();
    LOGGER.info(thief.toString());
  }
}
