public class Debug1 {
    public static void main(String[] args)
    {
        int myCheck = 50;
        int yourCheck = 19;
        System.out.println("Tips are");
        calcTip(myCheck);
        calcTip(yourCheck);
    }
        public static void calcTip(int bill)
    {
        final double RATE = 0.15;
        double tip;
        tip = bill * RATE;
        System.out.println("The tip should be at least " + tip);
    }
}



