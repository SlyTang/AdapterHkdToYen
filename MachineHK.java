public class MachineHK implements IHongKong{
    IHongKong adapter;
    public MachineHK(IHongKong adapter){
        this.adapter = adapter;
    }
    public void buy(){
        System.out.println("HKD :"+getPriceHKD());
    }
    public double getPriceHKD(){
        return adapter.getPriceHKD();
    }
}