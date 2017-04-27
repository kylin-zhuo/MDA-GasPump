package States;

import DataStore.Data;
import DataStore.Data1;
import DataStore.Data2;


/** State pattern
 * The state 3 - ready to select the gas type or cancel the transaction
 * 
 * @author Lin Zhuo
 *
 */

public class S3 extends State {

    private final int id = 3;
    
    @Override
    public void selectGas(int x) {
        
        op.setPrice(x);
        if(x == 1){
            System.out.print("Regular Selected. ");
        }
        else if (x == 2){
            System.out.print("Super Selected. ");
        }
        else if (x == 3){
            System.out.print("Premium Selected. ");
        }
        
        Data d = new Data();
        int gp = d.getGP();
        if(gp == 1)
        {
            Data d1 = new Data1();
            System.out.println("Price: " + d1.getPrice1() + ". Press f) to start pump.");
        }
        if(gp == 2)
        {
            Data d2 = new Data2();
            System.out.println("Price: " + d2.getPrice2() + ". Press d) to start pump.");
        }
       
    }
    
    @Override
    public void cancel() {
        
        op.cancelMsg();
    }
    
    public int getID(){
        return id;
    }
    
}
