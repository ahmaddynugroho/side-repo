public class r215 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public r215(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public r215(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }

    public void setLimit(int lim) { limit = lim; }

    public boolean charge(double price) {
        if (price + balance > limit) return false;
        balance += price;
        return true;
    }

    public void makePayment(double amount) { 
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        if (amount >= 0) balance -= amount; 
    }

    public static void printSummary(r215 card) {
        System.out.println("\n\nCustomer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }

    public static void main(String[] args) {
        r215[] wallet = new r215[3];
        wallet[0] = new r215("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new r215("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new r215("Jogn Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        // for (int val = 1; val <= 65; val++) {
        //     if (!wallet[0].charge(3*val)) System.out.println("Error");
        //     if (!wallet[1].charge(2*val)) System.out.println("Error2");
        //     if (!wallet[2].charge(val)) System.out.println("Error3");
        // }

        // for (r215 card : wallet) {
        //     r215.printSummary(card);
        //     while (card.getBalance() > 200.0) {
        //         card.makePayment(200);
        //         System.out.println("New balance = " + card.getBalance());
        //     }
        // }

        try {
            wallet[0].makePayment(-10);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Negative input!");
        }
    }
}