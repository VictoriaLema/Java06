package homework.HW8_2;

public class Worker extends Employee {
    private int days;
    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {

        return days;
    }

    @Override
    public double getSalary() {

        return this. getSalary()* days;
    }
}
