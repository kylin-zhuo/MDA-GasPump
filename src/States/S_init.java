package States;

/** State pattern
 * The initial state: able to set the gas prices and activate the gas pump
 * 
 * @author Lin Zhuo
 *
 */
public class S_init extends State {
    
    public int id = -1;
    
    @Override
    public void activate() {
        op.storeData();
    }
    
    public int getID(){
        return this.id;
    }

}
