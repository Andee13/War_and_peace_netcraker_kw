package com.vacik.andee;

public class headquarter {


    public static void main(String[] args) {
        General gerenal = new General();
        gerenal.eat();
        gerenal.setName("General main");
        System.out.println(gerenal.getName());

        Soldier soldier[] = new Soldier[10];
        // = {soldier1,  }
        Soldier soldier1 = new Soldier();
        soldier[0] = soldier1;
        //soldier[0](true, 2000);
        soldier[0].setWeapenYearOfManufactering(2000);
        System.out.println(soldier[0].getWeapenYearOfManufactering());


//        Commander commander[] = new Commander[2];
//        commander[0].general.setName("General Max");
//        System.out.println(commander[0].general.getName());


    }

}
