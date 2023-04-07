
public class Manager_lesson extends Worker_lesson{

    int countWorkers ;

    public Manager_lesson(String name, int age, int salary, int countWorkers) {
        super(name, age, salary);
        this.countWorkers = countWorkers;
    }
}
