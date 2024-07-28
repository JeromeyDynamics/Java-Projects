package keywords.super_for_child_class;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman",43,"everything");

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }
}
