public class PC extends Electronics{
    private String cpu;

    public PC(int price, String brand, String type, String cpu){
        super(price, brand, type);
        this.cpu = cpu;
    }

    public void upgradeCpu(String newCpu){
        cpu = newCpu;
    }

    public String getCpu(){
        return cpu;
    }
}
