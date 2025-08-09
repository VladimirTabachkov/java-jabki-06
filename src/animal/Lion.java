package animal;

/**
 * 3. Зоопарк
 * Класс Lion (наследует Animal)
 * Переопределите makeSound(): "Рычание!".
 * Добавьте метод hunt(), выводящий "Охота на антилопу".
 */

public class Lion extends Animal{
    public Lion(int age) {
        super("Лев", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Рычание!");
    }

    public void hunt() {
        System.out.println("Охота на антилопу");
    }
}
