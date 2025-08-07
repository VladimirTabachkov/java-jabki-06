package animal;

/**
 * 3. Зоопарк
 * Базовый класс Animal с полями: name, age.
 * Методы:
 * makeSound() (выводит "Издает звук"),
 * eat() (выводит "[name] ест").
 *
 * Задание:
 *
 * Создайте вольер (List<Animal>) с разными животными.
 *
 * Вызовите makeSound() для всех, игнорируя конкретные типы.
 */

public class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Издает звук");
    }

    public void eat() {
        System.out.printf("%s ест\n", this.name);
    }
}
