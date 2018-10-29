package com.vacik.andee;

import java.util.concurrent.ExecutionException;

public class General extends Man implements Fightable{
    private Commander com[] = new Commander[2];
    private int amount_won_wars;
    private String name;

    @Override
    public void fight() {
        System.out.println("I am ruling war ");
    }

    @Override
    public void report() {
        System.out.println("War is won");
    }

    public General(int amount_won_wars) throws Exception {
//        if(amount_won_wars <=1){
//            throw new Exception("Wrong general");
//        }
        this.amount_won_wars = amount_won_wars;
    }

    public General(String name) {
        this.name = name;
    }

    public General() {
    }



    public int getAmount_won_wars() {
        return amount_won_wars;
    }

    public void setAmount_won_wars(int amount_won_wars) {
        this.amount_won_wars = amount_won_wars;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
