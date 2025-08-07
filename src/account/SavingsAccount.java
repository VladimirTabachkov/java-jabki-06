package account;

/**
 * Банковские счета
 * Класс SavingsAccount (наследует Account)
 * Добавляет поле interestRate.
 * Переопределите withdraw(): запрет на снятие больше 1000 единиц за раз.
 * Добавьте метод applyInterest(), который начисляет проценты на баланс.
 */

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 1000) {
            super.withdraw(amount);
        } else {
            System.out.println("Со сберегательного аккаунта невозможно снять больше 1000 за раз");
        }
    }

    public void applyInterestRate() {
        this.balance *= 1 + (interestRate * 0.01);
        System.out.printf("Применено значение ключевой ставки к сберегательному счету. Новый баланс: %s\n", String.format("%.2f", balance));
    }
}
