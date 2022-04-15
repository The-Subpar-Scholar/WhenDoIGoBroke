import Expenses.Expense;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
public class Ledger {
    private BigDecimal balance;
    ArrayList<Expense> Expenses;

    public Ledger(int amount) {
        this.balance = new BigDecimal( amount);
        Expenses = new ArrayList<>();
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance.doubleValue();
    }
    public double getBalance(LocalDate date) {
        BigDecimal tempAmount = balance;
        for(Expense expense : Expenses) {
            tempAmount = tempAmount.subtract(BigDecimal.valueOf(expense.update(date)));
        }
        return tempAmount.doubleValue();
    }

    public void addExpense(Expense expense) {
        Expenses.add(expense);
    }

}

