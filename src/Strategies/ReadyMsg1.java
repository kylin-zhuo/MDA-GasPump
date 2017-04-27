package Strategies;

public class ReadyMsg1 extends ReadyMsg {
    
    @Override
    public void readyMsg() {

        System.out.println("Current # of Gallons: 0");
        System.out.println("Current cost: 0.0");
        System.out.println("Press g) to pump a gallon of gas. Press h) to stop.");
    }

}
