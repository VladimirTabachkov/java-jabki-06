package vehicle;

/**
 * 2. Система доставки
 * Создайте иерархию транспортных средств:
 * Базовый класс Vehicle с полями: maxSpeed, cargoCapacity.
 * Метод deliver(String destination) выводит: "Доставка в [destination]".
 *
 * Класс Drone (наследует Vehicle)
 * Переопределите deliver(), добавив: "Дрон взлетел. " + родительское сообщение.
 *
 * Задание:
 *
 * Создайте метод startDelivery(Vehicle vehicle, String address), вызывающий deliver().
 *
 * Продемонстрируйте работу с объектами Truck и Drone через этот метод.
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
