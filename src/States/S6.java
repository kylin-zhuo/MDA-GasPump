package States;

/** State pattern
 * The state 6 - able to choose whether to take the receipt for using cash
 * 
 * @author Lin Zhuo
 *
 */

public class S6 extends State {
    
    private final int id = 6;
    
    @Override
    public void receipt() {

        op.printReceipt();
        op.returnCash();
    }
    
    @Override
    public void noReceipt() {
        
        System.out.println("NO RECEIPT.");
        op.returnCash();
    }

    public int getID(){
        return id;
    }
}
