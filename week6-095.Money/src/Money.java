public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros = this.euros() + added.euros;
        int newCents = this.cents + added.cents;
        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared) {
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }

        } else if (this.euros < compared.euros) {
            return true;
        }

        return false;
    }

    public Money minus(Money decremented) {
        int eurosValue = 0;
        int centsValue = 0;
        if (this.euros == decremented.euros) {

            if (this.cents > decremented.cents) {
                eurosValue = this.euros() - decremented.euros();
                centsValue = this.cents - decremented.cents;
                return new Money(eurosValue, centsValue);

            }else {
                  return new Money(0, 0);
            }
        } else if (this.euros > decremented.euros) {
            //5.20
            //3.40
            if (this.cents >= decremented.cents) {
                eurosValue = this.euros() - decremented.euros();
                centsValue = this.cents - decremented.cents;
                return new Money(eurosValue, centsValue);
            } else if (this.cents < decremented.cents) {
                int tempEuros = this.euros - 1;
                int tempCents = this.cents + 100;
                eurosValue = tempEuros - decremented.euros;
                centsValue = tempCents - decremented.cents;
                return new Money(eurosValue, centsValue);

            }
        }

        return new Money(0, 0);
    }
}


