public class main{
    public static void main(String [] args){
        IJapan machineJP = new MachineJP();
        IHongKong adapter = new adapter(machineJP);
        MachineHK machineHK = new MachineHK(adapter);
        machineHK.buy();
    }
}