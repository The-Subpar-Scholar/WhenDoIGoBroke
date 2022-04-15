package Expenses;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Daily extends Expense {
    public Daily(int amount, int days) {
        super(amount);
    }
    public Daily(int amount) {
        super(amount);
    }

    public int update(LocalDate toDate) {
        return amount*(int)currentDate.until(toDate, ChronoUnit.DAYS);
    }
}