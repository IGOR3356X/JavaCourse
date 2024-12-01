package DZ_25_11_2024;

public class Archer extends Unit {

    private int countArrows;

    public Archer(int hp, int damage, String name, int countArrows) {
        super(hp, damage, name);
        this.countArrows = countArrows;
    }

    public int getCountArrows() {
        return countArrows;
    }

    public void setCountArrows(int countArrows) {
        this.countArrows = countArrows;
    }

    @Override
    public void Attack(Unit unit) {
        unit.setHp(unit.getHp() - this.getDamage());
        countArrows--;
    }

    @Override
    public String getAsString() {
        return "{" +
                "hp=" + getHp() +
                ", damage=" + getDamage() +
                ", name='" + getName() + '\'' +
                ", countArrows=" + countArrows +
                '}';
    }
}
