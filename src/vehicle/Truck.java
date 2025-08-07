package vehicle;

/**
 * 2. Система доставки
 * Класс Truck (наследует Vehicle)
 * Переопределите deliver(), добавив текст: "Грузовик загружен. " + родительское сообщение.
 */

public class Truck extends Vehicle {
    public Truck(double maxSpeed, double cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public void deliver(String destination) {
        System.out.print("Грузовик загружен. ");
        super.deliver(destination);
    }
}
