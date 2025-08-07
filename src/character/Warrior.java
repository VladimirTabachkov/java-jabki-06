package character;

/**
 * 4. Игровые персонажи
 * Класс Warrior (наследует Character)
 * Переопределите attack(): "Мечом в лицо!".
 * Добавьте метод block(), уменьшающий получаемый урон.
 */

public class Warrior extends Character{
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Мечом в лицо!");
    }

    public int block(int damage) {
        return damage / 10;
    }
}
