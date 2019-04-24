public class SpaService {
    public static void main(String[] args){
        private String serviceDescription;
        private double price;
        setServiceDescription();
        setPrice();
    }
    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    public void setPrice(double pr){
        price = pr;

    }
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
    public SpaService(){
        serviceDescription = "xxx";
        price = 0;
    }
}
