package homework.HW8_2;

public class Manager extends BaseManager  {

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates()> 0) {

            return this.getSalary() * (getNumberOfSubordinates() / 100.0 *3);
        } else {

            return this.getSalary();
        }

    }
}
