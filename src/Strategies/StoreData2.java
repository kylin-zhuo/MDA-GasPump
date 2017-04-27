package Strategies;

import DataStore.Data;
import DataStore.Data2;

public class StoreData2 extends StoreData {

    @Override
    public void storeData() {

        Data d2 = new Data2();
        d2.storePrice();
    }

}
