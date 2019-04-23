import java.util.Scanner;

public class BookStoreCredit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double gradePointAverage = 3.2;
        System.out.println("Please enter your name>>>");
        String Name = input.next();
        Name = input.next();
        System.out.println("Please enter your gradePointAverage>>>");
        gradePointAverage = input.nextDouble();
        math(gradePointAverage, Name);

    }
    public static void math(double gradePointAverage, String Name){
        double StoreMoney = gradePointAverage*10;

        System.out.println(Name + "You will have" + StoreMoney + " StoreMoney in the book store" + Name);
    }
}
