package AbstractFactory;

import Strategies.DisplayMenu;
import Strategies.GasPumpedMsg;
import Strategies.PaymentMsg;
import Strategies.PrintReceipt;
import Strategies.PumpGasUnit;
import Strategies.ReadyMsg;
import Strategies.SetInitialValues;
import Strategies.StopMsg;
import Strategies.StoreData;

public abstract class AbstractFactory {

    public abstract StoreData getStoreData();
    public abstract PaymentMsg getPaymentMsg();
    public abstract DisplayMenu getDisplayMenu();
    public abstract SetInitialValues getSetInitialValues();
    public abstract PumpGasUnit getPumpGasUnit();
    public abstract GasPumpedMsg getGasPumpedMsg();
    public abstract PrintReceipt getPrintReceipt();
    public abstract ReadyMsg getReadyMsg();
    public abstract StopMsg getStopMsg();
    
    
    
}
