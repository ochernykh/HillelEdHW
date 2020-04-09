package homework10.equlas;

import java.util.Objects;

public class Money {
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(currencyCode, money.currencyCode);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(amount, currencyCode);
    }
}
