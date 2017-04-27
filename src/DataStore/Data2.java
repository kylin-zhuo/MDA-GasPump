package DataStore;

/** Data Store for Gas Pump 2
 * 
 * @author Lin Zhuo
 *
 */

public class Data2 extends Data {

    static final int gasPump = 2;
    
    static int Price;
    static int Rprice;
    static int Pprice;
    static int Sprice;
    
    static int Rprice_temp;
    static int Pprice_temp;
    static int Sprice_temp;
    
    
    static int cash;
    static int cash_temp;
    
    static int L;
    
    @Override
    public void storePrice() {
        
        Rprice = Rprice_temp;
        Sprice = Sprice_temp;
        Pprice = Pprice_temp;
    }
    
    
    @Override
    public void storeCash() {

        cash = cash_temp;
    }
    
    public void setPrice(int a, int b, int c){
        Rprice = a;
        Pprice = b;
        Sprice = c;
    }
    
    public void setCash(int c){
        cash = c;
    }
    
    public int getCash(){
        return cash;
    }
    
    public void setL(int L_){
        L = L_;
    }
    
    public int getL() {
        return L;
    }
    
    @Override
    public int getGP() {

        return gasPump;
    }
    
    @Override
    public void setGasPrice(int p) {

        if(p == 1){
            Price = Rprice;
        }
        else if(p == 2){
            Price = Sprice;
        }
        else if(p == 3){
            Price = Pprice;
        }
        else
            System.out.println("Error in selecting gas.");
    }

    
    

    public int getRprice2() {
        return Rprice;
    }


    public int getPprice2() {
        return Pprice;
    }


    public int getSprice2() {
        return Sprice;
    }

    
    // return the price of the selected gas
    @Override
    public int getPrice2() {
        return Price;
    }

    public void setRprice_temp2(int rprice_temp) {
        Rprice_temp = rprice_temp;
    }


    public void setPprice_temp2(int pprice_temp) {
        Pprice_temp = pprice_temp;
    }


    public void setSprice_temp2(int sprice_temp) {
        Sprice_temp = sprice_temp;
    }


    public void setCash_temp(int cash_temp) {
        this.cash_temp = cash_temp;
    }
    
    
    
}
