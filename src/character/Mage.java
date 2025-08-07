package character;

/**
 * 4. Игровые персонажи
 * Класс Mage (наследует Character)
 * Переопределите attack(): "Огненный шар!".
 * Добавьте метод heal(), восстанавливающий здоровье.
 */

public class Mage extends Character{
    private int maxhealth;

    public Mage(String name, int health) {
        super(name, health);
        this.maxhealth = health;
    }

    @Override
    public void attack() {
        System.out.println("Огненный шар!");
    }

    public void heal() {
        super.setHealth(this.maxhealth);
    }

}
