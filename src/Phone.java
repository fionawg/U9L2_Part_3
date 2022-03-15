public class Phone extends Electronics{
    private String appleOrAndroid;

    public Phone(int price, String brand, String type, String appleOrAndroid){
        super(price, brand, type);
        this.appleOrAndroid = appleOrAndroid;
    }

    public void switchh(){
        if (appleOrAndroid.equals("Apple")){
            appleOrAndroid = "Android";
        } else if (appleOrAndroid.equals("Android")){
            appleOrAndroid = "Apple";
        } else {
            System.out.println("It cannot be switched because the input was not apple or android.");
        }
    }

    public String getAppleOrAndroid(){
        return appleOrAndroid;
    }
}
