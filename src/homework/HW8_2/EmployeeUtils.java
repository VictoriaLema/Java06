package homework.HW8_2;

public class EmployeeUtils {
//    поиск сотрудника в массиве по его имени
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
//    подсчет зарплатного бюджета для всех сотрудников в массиве
//    поиск наименьшей зарплаты в массиве
//    поиск наибольшей зарплаты в массиве
//    поиск наименьшего количества подчиненных в массиве менеджеров
//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров


    public static int findByName(String name, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {

                return i;
            }
        }
        return -1;
    }

    public static int findBySubname(String subname, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().contains(subname)) {

                return i;
            }
        }
        return -1;
    }

    public static int countAllSalaries(Worker[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getSalary();
        }
        return -1;
    }

    public static double findLowestSalary(Worker[] array) {
        double min = 1.0 * Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < min) {
                min = array[i].getSalary();
            }
        }

        return min;
    }

    public static double findHighestSalary(Worker[] array) {
        double max = 1.0 * Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > max) {
                max = array[i].getSalary();
            }
        }

        return max;
    }

    public static int findMaxSubordinates(Manager[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNumberOfSubordinates() > max) {
                max = array[i].getNumberOfSubordinates();
            }
        }

        return max;
    }

    public static int findMinSubordinates(Manager[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNumberOfSubordinates() < min) {
                min = array[i].getNumberOfSubordinates();
            }
        }

        return min;
    }

    public static double findMinPremium(Manager[] array) {
        double min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if ((array[i].getSalary() - array[i].getSalary()) < min) {
                min = array[i].getSalary() - array[i].getSalary();
            }
        }

        return min;
    }

    public double findMaxPremium(Manager[] array) {
        double max = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if ((array[i].getSalary() - array[i].getSalary()) > max) {
                max = array[i].getSalary() - array[i].getSalary();
            }
        }

        return max;
    }
}
