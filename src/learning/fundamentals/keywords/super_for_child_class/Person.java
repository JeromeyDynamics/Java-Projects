package learning.fundamentals.keywords.super_for_child_class;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public String toString() {
        return this.name  + "\n" + this.age + "\n";
    }
}