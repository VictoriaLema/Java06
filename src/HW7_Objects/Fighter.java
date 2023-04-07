package HW7_Objects;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter f1, f2;
        if (firstAttacker.equals(fighter1.name)) {
            f1 = fighter1;
            f2 = fighter2;
        } else {
            f1 = fighter2;
            f2 = fighter1;
        }

        while (true) {
            f2.health -= f1.damagePerAttack;
            if (f2.health <= 0) {
                return f1.name;
            }

            f1.health -= f2.damagePerAttack;
            if (f1.health <= 0) {
                return f2.name;
            }
        }

    }

}
