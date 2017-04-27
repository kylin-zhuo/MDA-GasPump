package DataStore;

public class Data1 extends Data {

    static final int gasPump = 1;

    static int G;

    /**
     * Price - the price of selected gas, {Rprice, Sprice} 
     * Rprice - the price of regular gas 
     * Sprice - the price of super gas
     */
    static float Price;
    static float Rprice;
    static float Sprice;

    static float Rprice_temp;
    static float Sprice_temp;

    
    public float getRprice_temp1() {
        return Rprice_temp;
    }

    public void setRprice_temp1(float rprice_temp) {
        Rprice_temp = rprice_temp;
    }

    public float getSprice_temp1() {
        return Sprice_temp;
    }

    public void setSprice_temp1(float sprice_temp) {
        Sprice_temp = sprice_temp;
    }

    @Override
    public void storePrice() {
        Rprice = Rprice_temp;
        Sprice = Sprice_temp;
    }

    @Override
    public void setG(int _G) {
        G = _G;
    }

    @Override
    public int getG() {
        return G;
    }

    @Override
    public float getRprice1() {
        return Rprice;
    }

    public float getSprice1() {
        return Sprice;
    }

    // return the price of the selected gas
    public float getPrice1() {
        return Price;
    }

    @Override
    public int getGP() {
        
        return gasPump;
    }

    @Override
    public void setGasPrice(int p) {

        if (p == 1) {
            Price = Rprice;
        } else if (p == 2) {
            Price = Sprice;
        } else
            System.out.println("Error in selecting gas.");
    }

}
