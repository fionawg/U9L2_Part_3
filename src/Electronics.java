public class Electronics {
    private int price;
    private String brand;
    private String type;

    public Electronics(int price, String brand, String type){
        this.price = price;
        this.brand = brand;
        this.type = type;
    }

    public void buy(){
        System.out.println("You have brought a new " + type + " for " + "$" + price + ".");
    }

    public int getPrice(){
        return price;
    }

    public String getBrand(){
        return brand;
    }

    public String getType(){
        return type;
    }
}
