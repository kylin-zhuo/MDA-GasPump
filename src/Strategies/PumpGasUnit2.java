package Strategies;

import DataStore.Data;
import DataStore.Data2;

public class PumpGasUnit2 extends PumpGasUnit {

    @Override
    public void pumpGasUnit() {

        // Pump a liter of gas
        Data d = new Data2();
        System.out.println("Pumped a liter of gas.");
        d.setL(d.getL() + 1);

    }

}
