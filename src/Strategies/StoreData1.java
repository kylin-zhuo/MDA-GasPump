package Strategies;

import DataStore.Data;
import DataStore.Data1;

public class StoreData1 extends StoreData {
    
    
    @Override
    public void storeData() {
        
        Data d1 = new Data1();
        d1.storePrice();
    }
}
