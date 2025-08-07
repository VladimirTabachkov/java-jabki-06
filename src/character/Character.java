package character;

/**
 * 4. Игровые персонажи
 * Базовый класс Character с полями: name, health.
 * Методы:
 * attack(): "Атакую!",
 * takeDamage(int damage): уменьшает health.
 *
 * Класс Warrior (наследует Character)
 * Переопределите attack(): "Мечом в лицо!".
 * Добавьте метод block(), уменьшающий получаемый урон.
 *
 * Класс Mage (наследует Character)
 * Переопределите attack(): "Огненный шар!".
 * Добавьте метод heal(), восстанавливающий здоровье.
 *
 * Задание:
 *
 * Создайте бой между Warrior и Mage через вызовы attack() и takeDamage().
 */

public class Character {
    private final String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void attack() {
        System.out.println("Атакую!");
    }

    public void takeDamage(int damage) {
        setHealth(this.health - damage);
    }
}
