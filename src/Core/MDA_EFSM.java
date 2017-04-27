package Core;

import States.*;

/**
 * MDA_EFSM control block
 * Use centralized state pattern
 * 
 * @author Lin Zhuo
 *
 */
public class MDA_EFSM {

    State s;
    State si;
    State s0;
    State s1;
    State s2;
    State s3;
    State s4;
    State s5;
    State s6;
    
    int id;
    
    /**
     * Constructor
     */
    public MDA_EFSM() {

        this.id = -1;
        si = new S_init();
        s0 = new S0();
        s1 = new S1();
        s2 = new S2();
        s3 = new S3();
        s4 = new S4();
        s5 = new S5();
        s6 = new S6();
        s = si;
    }
    
    /**
     * MDA-EFSM Event: activate()
     * 
     */
    public void activate() {
        
        s.activate();
        id = s.getID();
        if(id == -1){
            s = s0;
        } 

    }

    /**
     * MDA-EFSM Event: start()
     * 
     */
    public void start() {
        s.start();
        id = s.getID();
        if (id == 0) {
            s = s1;
        }
    }

    /**
     * MDA-EFSM Event: payType(int pt)
     * @param pt
     * pay by credit card: 1 pay by cash: 2
     */
    public void payType(int pt) {
        s.payType(pt);
        id = s.getID();
        if (id == 1) {
            if (pt == 1) {
                s = s2;
            } else if (pt == 2) {
                s = s3;
            } else {
                System.out.println("Error in changing state.");
            }
        }
    }

    /**
     * MDA-EFSM Event: reject()
     */
    public void reject() {
        s.reject();
        id = s.getID();
        if (id == 2) {
            s = s0;
        }
    }

    /**
     * MDA-EFSM Event: cancel()
     */
    public void cancel() {
        s.cancel();
        id = s.getID();
        if (id == 3) {
            s = s0;
        }
    }

    /**
     * MDA-EFSM Event: approved()
     */
    public void approved() {
        s.approved();
        id = s.getID();
        if (id == 2) {
            s = s3;
        }
    }

    /**
     * MDA-EFSM Event: selecetGas(int x)
     * @param x - the indicator for the type of gas
     * 1 - regular
     * 2 - super
     * 3 - premium
     */
    public void selectGas(int x) {
        s.selectGas(x);
        id = s.getID();
        if (id == 3) {
            s = s4;
        }
    }

    /**
     * MDA-EFSM Event: startPump()
     */
    public void startPump() {
        s.startPump();
        id = s.getID();
        if (id == 4) {
            s = s5;
        }
    }

    /**
     * MDA-EFSM Event: pump()
     */
    public void pump() {
        s.pump();
        // no state changes
    }

    /**
     * MDA-EFSM Event: stopPump()
     */
    public void stopPump() {
        s.stopPump();
        id = s.getID();
        if (id == 5) {
            s = s6;
        }
    }

    /**
     * MDA-EFSM Event: receipt()
     */
    public void receipt() {
        s.receipt();
        id = s.getID();
        if (id == 6) {
            s = s0;
        }
    }

    /**
     * MDA-EFSM Event: noReceipt()
     */
    public void noReceipt() {
        s.noReceipt();
        id = s.getID();
        if (id == 6) {
            s = s0;
        }
    }

}
