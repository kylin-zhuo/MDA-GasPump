package States;

/** State pattern
 * The state 4 - ready to start pumping
 * 
 * @author Lin Zhuo
 *
 */

public class S4 extends State {
    
    private final int id = 4;
    
    @Override
    public void startPump() {
        
        op.setInitialValues();
        op.readyMsg();
        
    }
    
    public int getID(){
        return id;
    }
    
    

}
