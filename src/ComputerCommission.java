import java.util.Scanner;

public class ComputerCommission {
    public static void main(String[] args){

    String vType;
    int value;
    double commRate;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the value of the vehicle>>>>");
    value = input.nextInt();
    System.out.println("Please enter the type of car>>>>");
    vType = input.next();
    System.out.println("Please enter the commission rate>>>>");
    commRate = input.nextInt();


  //  computerCommision(value, commRate, vType);



    }
    public static void computerCommision(int value, double rate, char vehicle){
        double commission;
        commission = value * rate;
        System.out.println("\nThe" + vehicle + " type vehicle is worth $" + value);

        System.out.println("With " +(rate * 100) + "% commission rate, the commission is $" + commission);
    }
}
