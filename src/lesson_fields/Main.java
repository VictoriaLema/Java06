package lesson_fields;

public class Main {
    public static void main(String[] args) {
        Person john = new Person();
        Name name = new Name();
        name.firstName = "John";
        name.lastName = "Doe";
        john.name = name;
        john.age = 36;

        Person jane = new Person();
        Name name1 = new Name();
        name1.firstName = "Jane";
        name1.lastName = "Doe";
        jane.name = name;
        jane.age = 34;

        System.out.println(john.getFullInfo());
        System.out.println(jane.getFullInfo());



    }
}
