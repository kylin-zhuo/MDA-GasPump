package Strategies;

import DataStore.Data;
import DataStore.Data2;

public class GasPumpedMsg2 extends GasPumpedMsg {

    @Override
    public void gasPumpedMsg() {

//        System.out.println("Gas pumped msg for GP2");
        
        Data d = new Data2();
        int price = d.getPrice2();
        int amount = d.getL();
        int cost = price * amount; 
        
        System.out.println("Current # of Liters: " + amount);
        System.out.println("Current cost: " + cost);
        System.out.println("Press e) to pump a liter of gas. Press f) to stop.");


    }

}
