package States;

/** State pattern
 * The state 2 - ready to reject or approve for using the credit card
 * 
 * @author Lin Zhuo
 *
 */

public class S2 extends State {

    private final int id =2;
    
    @Override
    public void reject() {

        op.rejectMsg();
    }
    
    @Override
    public void approved() {
        
        System.out.print("Credit Card Approved. ");
        op.displayMenu();
    }
    
    public int getID(){
        return id;
    }
    
    
    
    
}
