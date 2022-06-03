public class adapter implements IHongKong{
    public IJapan machineJP;
    public adapter(IJapan machineJP){
        this.machineJP = machineJP;
    }
    
    public double getPriceHKD(){
        return round5(machineJP.getPriceYEN() * 0.074);
    }
    
    double round5(double value) {
        return ((int)(value*2))/2.0;
    }
}