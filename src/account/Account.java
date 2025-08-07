package account;

import java.util.UUID;

/**
 * Банковские счета
 * Создайте иерархию:
 * Базовый класс Account с полями: accountNumber, balance.
 * Методы:
 * deposit(double amount) (пополнение),
 * withdraw(double amount) (снятие, не может уйти в минус),
 * displayInfo() (выводит номер счета и баланс).
 *
 * Задание:
 *
 * Создайте массив Account[] accounts с объектами SavingsAccount и CreditAccount.
 *
 * Продемонстрируйте полиморфизм: вызовите withdraw() и displayInfo() для всех элементов массива.
 */
public class Account {
    private final UUID accountNumber;
    protected double balance;

    public Account(double balance) {
        this.accountNumber = UUID.randomUUID();
        setBalance(balance);
    }

    public UUID getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(this.balance + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            setBalance(this.balance - amount);
        }
    }

    public void displayInfo() {
        System.out.printf("Счет №%s; Баланс %s\n", this.accountNumber, this.balance);
    }

}
