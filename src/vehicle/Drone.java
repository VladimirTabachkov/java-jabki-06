package vehicle;

/**
 * 2. Система доставки
 * Класс Drone (наследует Vehicle)
 * Переопределите deliver(), добавив: "Дрон взлетел. " + родительское сообщение.
 */

public class Drone extends Vehicle {
    public Drone(double maxSpeed, double cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public void deliver(String destination) {
        System.out.print("Дрон взлетел. ");
        super.deliver(destination);
    }
}
