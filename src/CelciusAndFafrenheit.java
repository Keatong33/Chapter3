import java.util.Scanner;

public class CelciusAndFafrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double morning;
        double afternoon;
        double evening;
        System.out.println("Put in the temperature for morning>>>");
        morning=input.nextByte();
        System.out.println("Put in the temperature for the afternoon>>>");
        afternoon=input.nextByte();
        System.out.println("Put in the temperature for the evening>>>");
        evening=input.nextByte();
        Math(morning, afternoon, evening);

    }
    public static void Math(double morning, double afternoon, double evening){
        double morningTemp= (morning-32)/1.8000;
        double afternoonTemp= (afternoon-32)/1.8000;
        double eveningTemp= (evening-32)/1.8000;
        System.out.println("In the morning the temperature in celcius is " +morningTemp+
                "In the afternoon the celcius temp is" +afternoonTemp+ "The temperature in celcius in the evening is"+eveningTemp);
    }

}
