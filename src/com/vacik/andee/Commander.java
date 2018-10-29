package com.vacik.andee;

public class Commander extends Man implements Fightable {
    private Soldier group[] = new Soldier[5];
    private boolean ableToAttack;
    private String name;
    private General general;

    @Override
    public void fight() {
        System.out.println("Say where to attack");
    }
    @Override
    public void report() {
        System.out.println("We trying to cope with enemy, my commander is " + general.getName());
    }

    public Commander(String name) {
        this.name = name;
    }

    public Commander(boolean ableToAttack) {
        this.ableToAttack = ableToAttack;
    }

    public Commander() {}

    public void setGeneral(General general) {
        this.general = general;
    }

    public General getGeneral() {
        return general;
    }

    public Soldier[] getGroup() {
        return group;
    }

    public boolean isAbleToAttack() {
        return ableToAttack;
    }

    public String getName() {
        return name;
    }

    public void setAbleToAttack(boolean ableToAttack) {
        this.ableToAttack = ableToAttack;
    }

    public void setGroup(Soldier[] group) {
        this.group = group;
    }
    void setCommander(){

    }

    public void setName(String name) {
        this.name = name;
    }

}
