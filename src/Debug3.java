import java.util.Scanner;
public class Debug3 {
    public static void main(String[] args)
        {
            String name;
           // name = getName;
            //displayGreeting(name);
        }
        public static String getName()
        {
            String name;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter name ");
            name = input.nextLine();
            return name;
        }
        public static void displayGreeting(int name)
        {
            System.out.println("Hello, " + name + "!");
        }
    }

