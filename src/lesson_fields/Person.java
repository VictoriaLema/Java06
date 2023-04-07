package lesson_fields;

public class Person {
    Name name;
    int age;

    String getFullInfo() {
        return "name " + name.getFullInfo() + " age " + age;
    }
}
