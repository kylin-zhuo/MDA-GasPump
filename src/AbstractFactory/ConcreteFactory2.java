package AbstractFactory;

import Strategies.DisplayMenu;
import Strategies.DisplayMenu2;
import Strategies.GasPumpedMsg;
import Strategies.GasPumpedMsg2;
import Strategies.PaymentMsg;
import Strategies.PaymentMsg2;
import Strategies.PrintReceipt;
import Strategies.PrintReceipt2;
import Strategies.PumpGasUnit;
import Strategies.PumpGasUnit2;
import Strategies.ReadyMsg;
import Strategies.ReadyMsg2;
import Strategies.SetInitialValues;
import Strategies.SetInitialValues2;
import Strategies.StopMsg;
import Strategies.StopMsg2;
import Strategies.StoreData;
import Strategies.StoreData2;

public class ConcreteFactory2 extends AbstractFactory {
    
    @Override
    public StoreData getStoreData() {
        
        StoreData sd = new StoreData2();
        return sd;
    }
    
    @Override
    public PaymentMsg getPaymentMsg() {
        
        PaymentMsg pm = new PaymentMsg2();
        return pm;
        
    }
    
    @Override
    public DisplayMenu getDisplayMenu() {

        DisplayMenu dm = new DisplayMenu2();
        return dm;
    }
    
    @Override
    public SetInitialValues getSetInitialValues() {

        SetInitialValues si = new SetInitialValues2();
        return si;
    }
    
    @Override
    public PumpGasUnit getPumpGasUnit() {

        PumpGasUnit pgu = new PumpGasUnit2();
        return pgu;
    }
    
    @Override
    public GasPumpedMsg getGasPumpedMsg() {

        GasPumpedMsg gpm = new GasPumpedMsg2();
        return gpm;
    }

    @Override
    public PrintReceipt getPrintReceipt() {

        PrintReceipt pr = new PrintReceipt2();
        return pr;
    }
    
    @Override
    public ReadyMsg getReadyMsg() {

        ReadyMsg rm = new ReadyMsg2();
        return rm;
    }
    
    @Override
    public StopMsg getStopMsg() {
        
        StopMsg sm = new StopMsg2();
        return sm;
    }
}
