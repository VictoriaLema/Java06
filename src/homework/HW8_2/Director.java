package homework.HW8_2;

public class Director extends BaseManager {
    //метод getSalaryDirector должен возвращать результат по формуле -
    // <базовая ставка> * (<количество подчиненных> / 100 * 9).
    // Если количество подчиненных 0, то результат как у обычного рабочего.
    public double getSalaryDirector () {

        return getSalary() * (getNumberOfSubordinates()/100.0 * 9);
    }



}
