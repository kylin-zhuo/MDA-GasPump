package AbstractFactory;

import Strategies.DisplayMenu;
import Strategies.DisplayMenu1;
import Strategies.GasPumpedMsg;
import Strategies.GasPumpedMsg1;
import Strategies.PaymentMsg;
import Strategies.PaymentMsg1;
import Strategies.PrintReceipt;
import Strategies.PrintReceipt1;
import Strategies.PumpGasUnit;
import Strategies.PumpGasUnit1;
import Strategies.ReadyMsg;
import Strategies.ReadyMsg1;
import Strategies.SetInitialValues;
import Strategies.SetInitialValues1;
import Strategies.StopMsg;
import Strategies.StopMsg1;
import Strategies.StoreData;
import Strategies.StoreData1;

public class ConcreteFactory1 extends AbstractFactory {
    
    @Override
    public StoreData getStoreData() {
        
        StoreData sd = new StoreData1();
        return sd;
    }
    
    @Override
    public PaymentMsg getPaymentMsg() {
        
        PaymentMsg pm = new PaymentMsg1();
        return pm;
        
    }
    
    @Override
    public DisplayMenu getDisplayMenu() {

        DisplayMenu dm = new DisplayMenu1();
        return dm;
    }
    
    @Override
    public SetInitialValues getSetInitialValues() {

        SetInitialValues si = new SetInitialValues1();
        return si;
    }
    
    @Override
    public PumpGasUnit getPumpGasUnit() {

        PumpGasUnit pgu = new PumpGasUnit1();
        return pgu;
    }
    
    @Override
    public GasPumpedMsg getGasPumpedMsg() {

        GasPumpedMsg gpm = new GasPumpedMsg1();
        return gpm;
    }
    
    @Override
    public PrintReceipt getPrintReceipt() {

        PrintReceipt pr = new PrintReceipt1();
        return pr;
    }
    
    @Override
    public ReadyMsg getReadyMsg() {

        ReadyMsg rm = new ReadyMsg1();
        return rm;
    }

    
    @Override
    public StopMsg getStopMsg() {

        StopMsg sm = new StopMsg1();
        return sm;
    }
}
