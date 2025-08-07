import account.Account;
import animal.Animal;
import animal.Lion;
import character.Mage;
import character.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Vehicle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    @Test
    public void accountTest() {
        Account account = new Account(1100);
        Assertions.assertEquals(1100, account.getBalance());
        account.deposit(-50);
        Assertions.assertEquals(1100, account.getBalance());
        account.withdraw(1050);
        Assertions.assertEquals(50, account.getBalance());
        account.withdraw(100);
        Assertions.assertEquals(50, account.getBalance());
    }

    @Test
    public void animalTest() {
        Lion lion = new Lion(1);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        lion.makeSound();
        Assertions.assertEquals("Рычание!", outContent.toString().trim());
        ByteArrayOutputStream outContent2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent2));
        lion.hunt();
        Assertions.assertEquals("Охота на антилопу", outContent2.toString().trim());
    }

    @Test
    public void characterTest() {
        Mage mage = new Mage("Warlord", 200);
        Warrior warrior = new Warrior("Konan", 1000);
        Assertions.assertEquals(200, mage.getHealth());
        mage.attack();
        warrior.takeDamage(50);
        Assertions.assertEquals(950, warrior.getHealth());
        warrior.takeDamage(100);
        Assertions.assertEquals(850, warrior.getHealth());
    }

    @Test
    public void vehicleTest() {
        Vehicle vehicle = new Vehicle(120, 500);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        vehicle.deliver("Москва");
        Assertions.assertEquals("Доставка в Москва", outContent.toString().trim());
    }

}