package character;

/**
 * 4. Игровые персонажи
 * Базовый класс Character с полями: name, health.
 * Методы:
 * attack(): "Атакую!",
 * takeDamage(int damage): уменьшает health.
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
        return this.health;
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
