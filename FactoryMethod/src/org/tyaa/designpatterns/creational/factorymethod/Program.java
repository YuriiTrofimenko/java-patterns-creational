/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.designpatterns.creational.factorymethod;

import java.util.logging.Logger;

/**
 *
 * @author yurii
 */
public class Program {

    private static final Logger LOGGER =
            Logger.getLogger(Program.class.getName());

    private final Blacksmith blacksmith;

    /**
     * Creates an instance of <code>App</code> which will use
     * <code>blacksmith</code> to manufacture the weapons for war.
     * <code>App</code> is unaware which concrete implementation of
     * {@link Blacksmith} it is using. The decision of which blacksmith
     * implementation to use may depend on configuration, or the type of rival
     * in war.
     *
     * @param blacksmith a non-null implementation of blacksmith
     */
    public Program(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        // Lets go to war with Orc weapons
        var app = new Program(new OrcBlacksmith());
        app.manufactureWeapons();

        // Lets go to war with Elf weapons
        app = new Program(new ElfBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons() {
        var weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(weapon.toString());
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(weapon.toString());
    }
}
