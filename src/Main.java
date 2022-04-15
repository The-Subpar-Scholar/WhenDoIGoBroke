import Expenses.Expense;
import Expenses.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Ledger myLedger = new Ledger(10000);
        myLedger.addExpense(new Monthly(14));
        myLedger.addExpense(new Yearly(200));
        myLedger.addExpense(new Daily(4));

        System.out.println(myLedger.getBalance());
        System.out.println(myLedger.getBalance(LocalDate.now().plusYears(1)));
    }
}
