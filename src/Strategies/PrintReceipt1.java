package Strategies;

import DataStore.Data;
import DataStore.Data1;

public class PrintReceipt1 extends PrintReceipt {

    @Override
    public void printReceipt() {
        
        Data d = new Data1();
        int amount = d.getG();
        float price = d.getPrice1();
        
        float cost = amount * price;
        
        System.out.println("RECEIPT:");
        System.out.println("Total # of Gallons: " + amount);
        System.out.println("Unit price: " + price);
        System.out.println("Total cost: " + cost);

    }

}
