package DZ_25_11_2024;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Unit wizard = new Wizard(10, 20, "wiz1", 3);
        Unit archer = new Archer(3, 50, "ar1", 10);

        System.out.println(wizard.getAsString());
        System.out.println(archer.getAsString());

        //wizard.Attack(archer);

        archer.Attack(wizard);
        wizard.Attack(archer);

        System.out.println(wizard.getAsString());
        System.out.println(archer.getAsString());

        ArrayList<Unit> units = new ArrayList<>();
        units.add(new Wizard(10, 20, "wiz1", 3));
        units.add(new Archer(3, 50, "ar1", 10));

        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i).getAsString());
        }
    }
}
