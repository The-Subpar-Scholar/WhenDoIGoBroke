package Expenses;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Yearly extends Expense {
    public Yearly(int amount, int years) {
        super(amount);
    }
    public Yearly(int amount) {
        super(amount);
    }

    public int update(LocalDate toDate) {
        return amount*(int)currentDate.until(toDate, ChronoUnit.YEARS);
    }
}

