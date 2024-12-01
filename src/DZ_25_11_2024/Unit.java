package DZ_25_11_2024;

public abstract class Unit {
    private int hp;
    private int damage;
    private String name;

    public Unit(int hp, int damage, String name) {
        this.hp = hp;
        this.damage = damage;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void Attack(Unit unit);

    public abstract String getAsString();
}
