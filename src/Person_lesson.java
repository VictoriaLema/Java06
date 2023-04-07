public class Person_lesson {

    private String name;
    String lastName;
    int age;

    public Person_lesson () {

    }

    public Person_lesson (String name) { //overloading
        this.name = name;
    }

//    public Person_lesson (String name) { //например, дефолтный возраст 18
//        this.name = name;
//        age = 18;
//    }

    public Person_lesson (String name, int age) {
        this(name);
        this.age = age;
    }


    String getName () {
        return name;
    }

    void setName (String name) {
        this.name = name;
    }
}
