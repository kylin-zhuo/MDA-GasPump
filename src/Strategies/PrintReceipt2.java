package Strategies;

import DataStore.Data;
import DataStore.Data2;

public class PrintReceipt2 extends PrintReceipt {

    @Override
    public void printReceipt() {

        Data d = new Data2();
        int amount = d.getL();
        int price = d.getPrice2();
        
        int cost = amount * price;
        int cash = d.getCash();
        
        System.out.println("RECEIPT:");
        System.out.println("Total # of Liters: " + amount);
        System.out.println("Unit price: " + price);
        System.out.println("Total cost: " + cost);
        System.out.println("Cash inserted: " + cash + "; Cash back: " + (cash - cost));

        

    }

}
