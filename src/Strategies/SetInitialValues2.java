package Strategies;

import DataStore.Data;
import DataStore.Data2;

public class SetInitialValues2 extends SetInitialValues {

    @Override
    public void setInitialValues() {
        
        // Set 0 gallon as initial value
        Data d2 = new Data2();
        d2.setL(0);
//        System.out.println("Set initial L to 0.");


    }

}
