package homework.HW8_1;

public class Employee {


    //Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    // Все поля сделать приватными и для каждого поля добавить методы set и get.
    // Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за количество дней
    // которые были переданы в качестве аргумента.
    private String name;
    private int age;
    private String gender;
    private  double daySalary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public double getSalary (int days) {
        return days * daySalary;
    }





}
