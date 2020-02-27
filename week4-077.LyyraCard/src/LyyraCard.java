public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if (this.balance - 2.50 >= 0) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        // write code here
        if (this.balance - 4 >= 0) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if (balance + amount <= 150) {
                balance += amount;
            } else {
                balance = 150;
            }
        }
    }
}
