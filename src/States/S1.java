package States;

/** State pattern
 * The state 1 - ready to set the payment type
 * 
 * @author Lin Zhuo
 *
 */

public class S1 extends State {
    
    private final int id = 1;

    @Override
    public void payType(int p) {

        if(p == 1){
            System.out.println("Pay by credit card. d)Reject or e)Approved");
        }
        else if (p == 2){
            op.storeCash();
            op.displayMenu();
        }
        else
            System.out.println("Error in changing state during selecting payment type.");
    }
    
    public int getID(){
        return id;
    }
    
    

}
