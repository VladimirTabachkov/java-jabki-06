package animal;

/**
 * 3. Зоопарк
 * Класс Parrot (наследует Animal)
 * Переопределите makeSound(): "Попугай повторяет: Привет!".
 * Используйте super в конструкторе для инициализации name и age.
 */

public class Parrot extends Animal{
    public Parrot(int age) {
        super("Попугай", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Попугай повторяет: Привет!");
    }
}
