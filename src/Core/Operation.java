package Core;

import AbstractFactory.AbstractFactory;
import AbstractFactory.ConcreteFactory1;
import AbstractFactory.ConcreteFactory2;
import DataStore.Data;
import DataStore.Data1;
import DataStore.Data2;
import Strategies.*;

/** This class contains the MDA-EFSM Actions (operations)
 * 
 * @author Lin Zhuo
 *
 */
public class Operation {

    Data dt = new Data();

    AbstractFactory cf1 = new ConcreteFactory1();
    AbstractFactory cf2 = new ConcreteFactory2();

    /**
     * MDA-EFSM Action: storeData()
     * Stores prices for the gas from the temporary data store
     */
    public void storeData() {

        StoreData sd;
        int gp = dt.getGP();

        if (gp == 1) {
            sd = cf1.getStoreData();
            sd.storeData();
        }
        if (gp == 2) {
            sd = cf2.getStoreData();
            sd.storeData();
        }

        System.out.println("Gas Pump " + gp + " Activated. Press b) to Start.");
    }

    /**
     * MDA-EFSM Action: paymentMsg()
     * Displays a type of payment method Implemented with Strategy and Abstract Factory
     */
    public void paymentMsg() {
        // // generate input panel here for inputting the payment method
        // System.out.println("Select payment method: Cash");
        // this.setPayMethod(0);
        PaymentMsg pm;
        int gp = dt.getGP();
        if (gp == 1) {
            pm = cf1.getPaymentMsg();
            pm.paymentMsg();

        }
        if (gp == 2) {
            pm = cf2.getPaymentMsg();
            pm.paymentMsg();
        }
    }

    /** 
     * MDA-EFSM Action: storeCash()
     * Stores cash from the temporary data store Only valid for Gas Pump 2
     */
    public void storeCash() {
        
        Data d = new Data2();
        d.storeCash();
        System.out.println("Account has cash: " + d.getCash());

    }

    /**
     * MDA-EFSM Action: displayMenu()
     * Displays a menu with a list of selections
     */
    public void displayMenu() {
        DisplayMenu dm;
        int gp = dt.getGP();
        if (gp == 1) {
            dm = cf1.getDisplayMenu();
            dm.displayMenu();

        }
        if (gp == 2) {
            dm = cf2.getDisplayMenu();
            dm.displayMenu();
        }

    }

    /**
     * MDA-EFSM Action: cancelMsg()
     * Displays a cancellation message NOT GAS PUMP SPECIFIC
     */
    public void cancelMsg() {
        System.out.println("The transaction is cancelled. Press b) to restart.");
    }

    /**
     * MDA-EFSM Action: rejectMsg()
     * Displays message that credit card is not approved
     */
    public void rejectMsg() {
        System.out.println("Credit card rejected. Press b) to start again.");
    }

    /**
     * MDA-EFSM Action: setPrice(int p)
     * Sets the price for the gas identified by the p identifier
     * @param p - the indicator of a gas type
     * 1 - Regular 
     * 2 - Super  
     * 3 - Premium 
     */
    public void setPrice(int p) {
        Data d;
        int gp = dt.getGP();
        if (gp == 1)
            d = new Data1();
        else if (gp == 2)
            d = new Data2();
        else
            d = new Data();
        d.setGasPrice(p);
    }

    /**
     * MDA-EFSM Action: readyMsg()
     * Displays the message that it is ready for pumping
     */
    public void readyMsg() {

        ReadyMsg rm;
        int gp = dt.getGP();
        if (gp == 1) {
            rm = cf1.getReadyMsg();
            rm.readyMsg();
        }
        if (gp == 2) {
            rm = cf2.getReadyMsg();
            rm.readyMsg();
        }
    }

    /**
     * MDA-EFSM Action: setInitialValues()
     * set the initial amount of gas (G or L) to 0
     * 
     */
    public void setInitialValues() {

        SetInitialValues siv;
        int gp = dt.getGP();
        if (gp == 1) {
            siv = cf1.getSetInitialValues();
            siv.setInitialValues();

        }
        if (gp == 2) {
            siv = cf2.getSetInitialValues();
            siv.setInitialValues();
        }

    }

    /**
     * MDA-EFSM Action: pumpGasUnit()
     * Disposes a unit of gas and counts the number of units disposed
     */
    public void pumpGasUnit() {
        PumpGasUnit pgu;
        int gp = dt.getGP();
        if (gp == 1) {
            pgu = cf1.getPumpGasUnit();
            pgu.pumpGasUnit();
        }
        if (gp == 2) {
            pgu = cf2.getPumpGasUnit();
            pgu.pumpGasUnit();
        }
    }

    /**
     * MDA-EFSM Action: gasPumpedMsg()
     * Displays the information of disposed gas
     */
    public void gasPumpedMsg() {
        GasPumpedMsg gpm;
        int gp = dt.getGP();
        if (gp == 1) {
            gpm = cf1.getGasPumpedMsg();
            gpm.gasPumpedMsg();
        }
        if (gp == 2) {
            gpm = cf2.getGasPumpedMsg();
            gpm.gasPumpedMsg();
        }
    }

    /**
     * MDA-EFSM Action: stopMsg()
     * Displays the message that the pumping is stopped Displays the message
     * that whether receipt is needed (optional)
     */
    public void stopMsg() {
        StopMsg sm;
        int gp = dt.getGP();
        if (gp == 1) {
            sm = cf1.getStopMsg();
            sm.stopMsg();
        }
        if (gp == 2) {
            sm = cf2.getStopMsg();
            sm.stopMsg();
        }
    }

    /**
     * MDA-EFSM Action: printReceipt()
     * Prints a receipt
     */
    public void printReceipt() {
        PrintReceipt pr;
        int gp = dt.getGP();
        if (gp == 1) {
            pr = cf1.getPrintReceipt();
            pr.printReceipt();
        }
        if (gp == 2) {
            pr = cf2.getPrintReceipt();
            pr.printReceipt();
        }

    }

    /** 
     * MDA-EFSM Action: returnCash()
     * Returns the remaining cash
     */
    public void returnCash() {
        if (dt.getGP() == 2) {
            Data d2 = new Data2();
            int price = d2.getPrice2();
            int amount = d2.getL();
            int cash = d2.getCash();
            int returnCash = cash - price * amount;
            System.out.println("Return cash: " + returnCash);
        }
    }

}
