package States;

/** State pattern
 * The state 5 - able to pump the gas out or stop 
 * 
 * @author Lin Zhuo
 *
 */

public class S5 extends State {
    
    private final int id = 5;
    
    @Override
    public void pump() {

        op.pumpGasUnit();
        op.gasPumpedMsg();
    }
    
    @Override
    public void stopPump() {
        
        op.stopMsg();
    }
    
    public int getID(){
        return id;
    }
    
    
    
    
    
    
    

}
