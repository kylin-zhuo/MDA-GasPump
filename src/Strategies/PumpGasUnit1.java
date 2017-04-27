package Strategies;

import DataStore.Data;
import DataStore.Data1;

public class PumpGasUnit1 extends PumpGasUnit {

    
    Data d = new Data1();
    
    @Override
    public void pumpGasUnit() {

        // Pump a gallon of gas
//        float price = d.getPprice2();
        System.out.println("A Gallon Pumped.");
        d.setG(d.getG() + 1);

    }

}
