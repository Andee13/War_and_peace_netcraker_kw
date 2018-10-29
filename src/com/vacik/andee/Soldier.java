package com.vacik.andee;

public class Soldier extends Man implements Fightable {
    private boolean cartridge;
    private int weapenYearOfManufactering;
    private Commander commander;
    @Override
    public void fight() {
        System.out.println("I am fighting for my country");
    }
    @Override
    public void report() {
        System.out.println("Enemy is defeated, my commander is " + commander.getName() );
    }

    public Soldier() {
    }

    public Soldier(boolean cartridge) {
        this.cartridge = cartridge;
    }

    public Soldier(int weapenYearOfManufactering) throws Exception {
        if(weapenYearOfManufactering < 1988) {
            throw new Exception("weapenYearOfManufactering isn't true");
        }
        this.weapenYearOfManufactering = weapenYearOfManufactering;
    }

    public Soldier(boolean cartridge, int weapenYearOfManufactering) {
        this.cartridge = cartridge;
        this.weapenYearOfManufactering = weapenYearOfManufactering;
    }

    public int getWeapenYearOfManufactering() {
        return weapenYearOfManufactering;
    }

    public void setWeapenYearOfManufactering(int weapenYearOfManufactering) {
        this.weapenYearOfManufactering = weapenYearOfManufactering;
    }

    public void setCartridge(boolean cartridge) {
        this.cartridge = cartridge;
    }
}
