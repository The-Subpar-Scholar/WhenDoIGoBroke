package Expenses;

import java.time.LocalDate;
public abstract class Expense {
    protected int amount;
    protected LocalDate currentDate;
    public Expense (int amount) {
        this.amount = amount;
        currentDate = LocalDate.now();
    }
    public abstract int update(LocalDate toDate);

}