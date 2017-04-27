package Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import DataStore.Data;
import DataStore.Data2;

public class GasPump2 {
    
    MDA_EFSM m;
    Data dt;
    Data d;
    
    /**
     * Constructor 
     */
    public GasPump2() {
        m = new MDA_EFSM();
        dt = new Data();
        d = new Data2();
        dt.setGP(2);
    }
    
    /**
     * The input processor Activate(int a, int b, int c)
     * @param a - the price of regular gas
     * @param b - the price of super gas
     * @param c - the price of premium gas
     */
    public void Activate(int a, int b, int c){
        if(a > 0 && b > 0 && c > 0)
        {
            d.setRprice_temp2(a);
            d.setSprice_temp2(b);
            d.setPprice_temp2(c);
            m.activate();
        }
        else
        {
            System.out.println("Invalid Prices. Press a) to Re-Activate.");
        }
    }
    
    
    /**
     * The input processor Start()
     */
    public void Start(){
        m.start();
    }
    
    /**
     * The input processor PayCash(int c)
     * @param c - the prepaid cash
     */
    public void PayCash(int c){
        if(c > 0){
            d.setCash_temp(c);
            m.payType(2);
        }
        else{
            System.out.println("Invalid Cash. Press c) to re-enter.");
        }
    }
    
    /**
     * The input processor Cancel()
     */
    public void Cancel(){
        m.cancel();
    }
    

    /**
     * The input processor Super()
     * Pump the super type of gas
     */
    public void Super(){
        m.selectGas(2);
    }
    
    /**
     * The input processor Regular()
     * Pump the regular type of gas
     */
    public void Regular(){
        m.selectGas(1);
    }
    
    /**
     * The input processor Premium()
     * Pump the premium type of gas
     */
    public void Premium(){
        m.selectGas(3);
    }
    
    
    /**
     * The input processor StartPump()
     */
    public void StartPump(){
        m.startPump();
    }
    
    

    /**
     * The input processor PumpLiter()
     * Pump a liter of gas out
     */
    public void PumpLiter(){
        
        //if (d->cash<(d->L+1)*d->price) stop 
        if(d.getCash() < (d.getL() + 1) * d.getPrice2())
        {
            System.out.println("Not enough balance. Stop.");
            m.stopPump();
        }
        else
        {
            m.pump();   
        }
    }
    
    /**
     * The input processor Stop()
     * Stop pumping gas out
     */
    public void Stop(){
        m.stopPump();
    }
    
    /**
     * The input processor Receipt()
     * Print the receipt
     */
    public void Receipt(){
        m.receipt();
    }
    
    
    /**
     * The input processor NoReceipt()
     * Print the receipt
     */
    public void NoReceipt(){
        m.noReceipt();
    }
    
    
    
    public void runPump() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
       
        Scanner sc = new Scanner(System.in);
        String input;
        
        boolean flag = true;
        
        while (flag) {
            
            System.out.println("GasPump2 Operations:");

            System.out.println(
                    "a)Activate; "
                    + "b)Start; "
                    + "c)PayCash; "
                    + "0)Cancel; "
                    + "1)Regular; "
                    + "2)Super; "
                    + "3)Premium; "
                    + "d)StartPump; "
                    + "e)PumpLiter; "
                    + "f)Stop; "
                    + "g)Receipt; "
                    + "h)NoReceipt; "
                    + "i)Exit.");
            
            input = br.readLine();

            switch (input) {
            
            case "a": { // Activate(int a, int b, int c)
                System.out.println("Enter the price of Regular Gas: ");
                int a = sc.nextInt();
                System.out.println("Enter the price of Super Gas: ");
                int b = sc.nextInt();
                System.out.println("Enter the price of Premium Gas: ");
                int c = sc.nextInt();
                
                Activate(a, b, c);
                break;
            }
            
            case "b": { // Start
                Start();
                break;
            }

            case "c": { // Pay by cash
                System.out.println("Enter the prepaid cash:");
                int c = sc.nextInt();
                PayCash(c);
                break;
            }

            case "0": { // Cancel
                Cancel();
                break;
            }

            case "3": { // Premium
                Premium();
                break;
            }

            case "1": { // Regular
                Regular();
                break;
            }

            case "2": { // Super
                Super();
                break;
            }

            case "d": { // StartPump
                StartPump();
                break;
            }

            case "e": { // PumpLiter
                
                PumpLiter();
                break;
            }

            case "f": { // Stop
                Stop();
                break;
            }
            
            case "g": { // Receipt
                Receipt();
                break;
            }
            
            case "h": {
                NoReceipt();
                break;
            }
            
            case "i": {
                flag = false;
                break;
            }
            
            default: {
                System.out.println("Wrong choice. Enter again.");
                break;
            }
            
            
            }
        }
        
        System.out.println("Gas Pump 2 closed.");
        
    }
    
}
