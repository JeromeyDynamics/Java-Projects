public class infinite {
    public static void main(String[] args) {
        
        //run method (you can't put code after an infinite loop in the same method 
        //because it will put an error for the code not being able to be reached)
        whileInfinite();

    }

    public static void whileInfinite() {
        //you can put a true in a while to repeat infinitely because the value will always be true
        while (true) {
            System.out.println("OMG I'm infiiiiiinnniiiiiiiiitttteee!!! (but while)");
        }
    }

    public static void forInfinite() {
        //you can put no values in a for loop to make it so that there are no constraints and it runs infinitely
        for (;;) {
            System.out.println("OMG I'm infiiiiiinnniiiiiiiiitttteee!!! (but for)");
        }
    }
}
