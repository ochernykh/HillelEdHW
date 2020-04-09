package homework10.equlas;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class Main {
    public static void main(String[] args) {

        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        boolean balanced = income.equals(expenses);

        Money cash = new Money(42, "USD");
        Voucher voucher = new Voucher(42, "USD", "Amazon");

        System.out.println(balanced);//true
        System.out.println(voucher.equals(cash));//false
        System.out.println(cash.equals(voucher));//false

        //Verifying Java SE contracts
        EqualsVerifier.forClass(Money.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

}
