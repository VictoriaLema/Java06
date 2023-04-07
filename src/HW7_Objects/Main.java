package HW7_Objects;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "John";
        employee.age = 36;
        employee.gender = "m";

        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        System.out.println(fighter2.declareWinner(fighter1,fighter2,"Lew"));
        





//        Block b = new Block(new int[]{2, 4, 6});
//        b.getVolume();
//        b.getSurfaceArea();
//        System.out.println(b.getHeight());
//        System.out.println(b.getVolume());
//        System.out.println(b.getSurfaceArea());
//        System.out.println(b.getLength());

    }
}
