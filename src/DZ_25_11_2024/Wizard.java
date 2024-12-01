package DZ_25_11_2024;

public class Wizard extends Unit {
    private  int mana;

    public Wizard(int hp, int damage, String name, int mana)
    {
        super(hp, damage, name);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void Attack(Unit unit) {
        unit.setHp(unit.getHp() - this.getDamage());
        mana--;
    }

    @Override
    public String getAsString() {
        return "{" +
                "hp=" + getHp() +
                ", damage=" + getDamage() +
                ", name='" + getName() + '\'' +
                ", mana=" + mana +
                '}';
    }
}
