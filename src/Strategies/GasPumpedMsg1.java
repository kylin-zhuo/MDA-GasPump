package Strategies;

import DataStore.Data;
import DataStore.Data1;

public class GasPumpedMsg1 extends GasPumpedMsg {

    
    Data d = new Data1();
    
    @Override
    public void gasPumpedMsg() {

//        System.out.println("Gas pumped msg for GP1");
        float price = d.getRprice1();
        int amount = d.getG();
        float cost = price * amount; 
        
        System.out.println("Current # of Gallons: " + amount);
        System.out.println("Current cost: " + cost);
        System.out.println("Press g) to pump a gallon of gas. Press h) to stop.");
        

    }

}
