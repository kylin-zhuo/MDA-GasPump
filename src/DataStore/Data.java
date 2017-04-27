package DataStore;

/** Data Store
 * 
 * @author Lin Zhuo
 *
 */
public class Data {
    
    /**
     * gasPump: to indicate which gas pump is in use
     * gasPump == 1: Gas pump 1 is in use
     * gasPump == 2: Gas pump 2 is in use
     */
    static int gasPump = 0;
    
    public float getPrice1(){
        return 0.0f;
    }
    
    public int getPrice2(){
        return 0;
    }
    
    
    public float getRprice_temp() {
        return 0.0f;
    }

    public float getRprice1(){
        return 0.0f;
    }
    
    public float getSprice1(){
        return 0.0f;
    }
    
    public int getRprice2() {
        return 0;
    }


    public int getPprice2() {
        return 0;
    }

    public int getSprice2() {
        return 0;
    }

    
    public void setRprice_temp1(float rprice_temp) {
        
    }

    public float getSprice_temp() {
        return 0.0f;
    }

    public void setSprice_temp1(float sprice_temp) {
        
    }

    public void setRprice_temp2(int rprice_temp) {
        
    }

    public void setPprice_temp2(int pprice_temp) {

    }

    public void setSprice_temp2(int sprice_temp) {
        
    }

    public void setCash_temp(int cash_temp) {
        
    }
    
    public int getG(){
        return 0;
    }
   
    public void setG(int G_){

    }
    
    public int getL(){
        return 0;
    }
    
    public int getCash(){
        return 0;
    }
    
    public void setL(int L_){
        
    }
    
    public int getGP(){
        return gasPump;
    }
    
    public void setGP(int gp){
        gasPump = gp;
        
    }
    
    public void storePrice(){
        
    }
    
    public void storeCash(){
        
    }
    
    public void setGasPrice(int p){
        
    }

    

}
