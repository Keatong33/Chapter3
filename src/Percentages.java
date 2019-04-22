import java.util.Scanner;

public class Percentages {
    public static void main(String[] args){
        double a;
        double b;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a percent>>>");
        a = input.nextInt();
        System.out.println("Please enter another percent>>>");
        b = input.nextInt();
        computePercent(a, b);

    }
    public static void computePercent(double a, double b){
        double percent = (a/b)*100;
        System.out.println(a +"is" + percent + "percent of" + b);
    }
}
