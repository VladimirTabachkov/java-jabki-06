package vehicle;

/**
 * 2. Система доставки
 * Создайте иерархию транспортных средств:
 * Базовый класс Vehicle с полями: maxSpeed, cargoCapacity.
 * Метод deliver(String destination) выводит: "Доставка в [destination]".
 */

public class Vehicle {
    private double maxSpeed;
    private double cargoCapacity;

    public Vehicle(double maxSpeed, double cargoCapacity) {
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
    }

    public void deliver(String destination) {
        System.out.println("Доставка в " + destination);
    }
}
