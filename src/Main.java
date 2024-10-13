//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());
        System.out.println();

        Hero[] heroes = createHeroes();

        System.out.println("Heroes Information:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println("-----------------------");
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Flight");
        Hero hero2 = new Hero(120, 25, "Invisibility");
        Hero hero3 = new Hero(80, 20);

        return new Hero[]{hero1, hero2, hero3};
    }
}