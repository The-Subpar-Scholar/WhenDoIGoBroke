package Expenses;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Monthly extends Expense {
    public Monthly(int amount, int months) {
        super(amount);
    }
    public Monthly(int amount) {
        super(amount);
    }

    public int update(LocalDate toDate) {
        return amount*(int)currentDate.until(toDate, ChronoUnit.MONTHS);
    }
}

