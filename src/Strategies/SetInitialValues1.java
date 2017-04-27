package Strategies;

import DataStore.Data;
import DataStore.Data1;

public class SetInitialValues1 extends SetInitialValues {

    @Override
    public void setInitialValues() {

        // Set 0 gallon as initial value
        Data d1 = new Data1();
        d1.setG(0);
//        System.out.println("Set initial G to 0.");

    }

}
