import account.Account;
import account.SavingsAccount;
import account.CreditAccount;
import animal.Animal;
import animal.Lion;
import animal.Parrot;
import character.Mage;
import character.Warrior;
import vehicle.Drone;
import vehicle.Truck;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    /**
    * 1. Банковские счета
    * Задание:
    * Создайте массив Account[] accounts с объектами SavingsAccount и CreditAccount.
    *  Продемонстрируйте полиморфизм: вызовите withdraw() и displayInfo() для всех элементов массива.
    */
        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.add(new SavingsAccount(100, 20));
        accounts.add(new SavingsAccount(50000, 10));
        accounts.add(new CreditAccount(0,-1000));
        for (Account account : accounts) {
            account.displayInfo();
            account.withdraw(20);
            account.displayInfo();
        }
        System.out.println();

    /**
    * 2. Система доставки
    * Задание:
    * Создайте метод startDelivery(Vehicle vehicle, String address), вызывающий deliver().
    * Продемонстрируйте работу с объектами Truck и Drone через этот метод.
    */
        Truck truck1 = new Truck(120, 12000);
        Drone drone1 = new Drone(500, 80);

        startDelivery(truck1, "Владивосток");
        startDelivery(drone1, "Санкт-Петербург");
        System.out.println();

    /**
    * 3. Зоопарк
    * Задание:
    * Создайте вольер (List<Animal>) с разными животными.
    * Вызовите makeSound() для всех, игнорируя конкретные типы.
    */
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion(10));
        animals.add(new Parrot(20));

        for (Animal animal: animals) {
            animal.makeSound();
        }
        System.out.println();

    /**
    * 4. Игровые персонажи
    * Задание:
    * Создайте бой между Warrior и Mage через вызовы attack() и takeDamage().
    */
        Mage mage = new Mage("Warlord", 150);
        Warrior warrior = new Warrior("Paladin", 300);

        mage.attack();
        warrior.takeDamage(warrior.block(20));

        for (int i = 0; i < 4; i++) {
            warrior.attack();
            mage.takeDamage(10);
        }

        if (mage.getHealth() < 50) {
            mage.heal();
        }

        for (int i = 0; i < 5; i++) {
            mage.attack();
            warrior.takeDamage(warrior.block(53));
        }

        System.out.printf("Health of %s = %s\n", warrior.getName(), warrior.getHealth());
        System.out.printf("Health of %s = %s\n", mage.getName(), mage.getHealth());
    }

    public static void startDelivery (Vehicle vehicle, String destination){
        vehicle.deliver(destination);
    }
}