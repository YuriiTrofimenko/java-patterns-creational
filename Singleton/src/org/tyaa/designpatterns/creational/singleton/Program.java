/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.designpatterns.creational.singleton;

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

    // eagerly initialized singleton
    var ivoryTower1 = IvoryTower.getInstance();
    var ivoryTower2 = IvoryTower.getInstance();
    LOGGER.info(ivoryTower1.toString());
    LOGGER.info(ivoryTower2.toString());

    // lazily initialized singleton
    var threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
    var threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
    LOGGER.info(threadSafeIvoryTower1.toString());
    LOGGER.info(threadSafeIvoryTower2.toString());

    // enum singleton
    var enumIvoryTower1 = EnumIvoryTower.INSTANCE;
    var enumIvoryTower2 = EnumIvoryTower.INSTANCE;
    LOGGER.info(enumIvoryTower1.toString());
    LOGGER.info(enumIvoryTower2.toString());

    // double checked locking
    var dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
    LOGGER.info(dcl1.toString());
    var dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
    LOGGER.info(dcl2.toString());

    // initialize on demand holder idiom
    var demandHolderIdiom = InitializingOnDemandHolderIdiom.getInstance();
    LOGGER.info(demandHolderIdiom.toString());
    var demandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
    LOGGER.info(demandHolderIdiom2.toString());
  }
}
