package account;

/**
 * Банковские счета
 * Класс CreditAccount (наследует Account)
 * Добавляет поле creditLimit.
 * Переопределите withdraw(): разрешите уходить в минус до creditLimit.
 * Используйте super для вызова родительской логики снятия.
 */

public class CreditAccount extends Account {
    private double creditLimit = 0;

    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        setCreditLimit(creditLimit);
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        if (creditLimit <= 0) {
            this.creditLimit = creditLimit;
        }
    }

    @Override
    public void setBalance(double balance) {
        if (balance >= this.creditLimit) {
            this.balance = balance;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount >= this.creditLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Невозможно снять средства, так как кредитный лимит исчерпан");
        }
    }
}
