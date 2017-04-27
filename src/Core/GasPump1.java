package Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import DataStore.Data;
import DataStore.Data1;

public class GasPump1 {
    
    MDA_EFSM m;
    Data dt;
    Data d;
    
    // Constructor
    public GasPump1() {

        m = new MDA_EFSM();
        dt = new Data();
        d = new Data1();
        dt.setGP(1);
    }
    
    /**
     * The input processor Activate(float a, float b)
     * @param a - price of regular gas
     * @param b - price of super gas
     */
    public void Activate(float a, float b){
        
        if(a > 0 && b > 0)
        {
            d.setRprice_temp1(a);
            d.setSprice_temp1(b);
            m.activate();
        }
        else
        {
            System.out.println("Invalid prices. Press a) to re-activate.");
        }   
    }
    
    /**
     * The input processor Start()
     */
    public void Start(){
        m.start();
    }
    
    /**
     * The input processor PayCredit()
     */
    public void PayCredit(){
        m.payType(1);
    }
    
    /**
     * The input processor Reject()
     */
    public void Reject(){
        m.reject();
    }
    
    /**
     * The input processor Cancel()
     */
    public void Cancel(){
        m.cancel();
    }
    
    /**
     * The input processor Approved()
     */
    public void Approved(){
        m.approved();
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
     * The input processor StartPump()
     */
    public void StartPump(){
        m.startPump();
    }
    
    /**
     * The input processor PumpGallon()
     * Pump a gallon of gas out
     */
    public void PumpGallon(){
        m.pump();
    }
    
    /**
     * The input processor StopPump()
     * Stop pumping and get the receipt in the same time
     */
    public void StopPump(){
        m.stopPump();
        m.receipt();
    }
    
    
    public void runPump() throws IOException {
       
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner sc = new Scanner(System.in);
        String input;

        boolean flag = true;
        
        while (flag) {
            
            System.out.print("GasPump1 Operations: ");
            System.out.println(
                    "a)Activate; "
                    + "b)Start; "
                    + "c)PayCredit; "
                    + "d)Reject; "
                    + "e)Approved; "
                    + "0)Cancel; "
                    + "1)Regular; "
                    + "2)Super; "
                    + "f)StartPump; "
                    + "g)PumpGallon; "
                    + "h)StopPump; "
                    + "i)Exit.");
            
            input = br.readLine();

            switch (input) {
            case "a": { // Activate(float a, float b)
                // Hint to input the prices of Regular and Super gas
                System.out.println("Enter the price of Regular Gas: ");
                float a = sc.nextFloat();
                System.out.println("Enter the price of Super Gas:");
                float b = sc.nextFloat();
                
                Activate(a, b);
                break;
            }

            case "b": { // Start
                Start();
                break;
            }

            case "c": { // PayCredit
                PayCredit();
                break;
            }

            case "d": { // Reject
                Reject();
                break;
            }

            case "e": { // Approved
                Approved();
                break;
            }

            case "0": { // Cancel
                Cancel();
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


            case "f": { // StartPump
                StartPump();
                break;
            }

            case "g": { // PumpGasUnit
                PumpGallon();
                break;
            }

            case "h": { // StopPump
                StopPump();
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
        System.out.println("Gas Pump 1 closed.");

    }

}
