package HW7_Objects;

public class Person {

//    Необходимо создать класс HW7_Objects.Person с полями: имя, возраст, пол. Класс должен иметь
//    метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как
//    мужской и префикс “Mrs. ” если женский.
        String name;
        int age;
        String gender;

        String getName (String name, String gender){
            if (gender.equals("m")) {
                name = "Mr " + name;
            } else if (gender.equals("f")) {
                name = "Mrs " + name;
            } else {
                name = name;
            }

            return name;
        }

}

