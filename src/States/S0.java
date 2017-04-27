package States;

import DataStore.Data;

/** State pattern
 * The state 0 - able to start the pump
 * 
 * @author Lin Zhuo
 *
 */

public class S0 extends State{
    
    public int id = 0;
    
    @Override
    public void start() {
        
        Data dt = new Data();
        int gp = dt.getGP();
        System.out.print("GP" + gp + " Started. ");
        op.paymentMsg();
    }
    
    public int getID(){
        return id;
    }
    

}
