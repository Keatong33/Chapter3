import java.util.Scanner;
public class CreateSpaServices
{
    public static void main(String[] args)
    {
        String Service;
        double price;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter service>>");
        Service = keyboard.nextLine();
        System.out.println("Enter price>>");
        price = keyboard.nextDouble();
        firstService.setPrice(price);
        keyboard.nextLine();
        secondService.setServiceDescription(Service);
        secondService.setPrice(price);
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $ " + firstService.getPrice());

    }
}




