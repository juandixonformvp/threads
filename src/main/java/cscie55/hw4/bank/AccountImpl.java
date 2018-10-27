package cscie55.hw4.bank;

public class AccountImpl implements Account {

    private int myID;
    private long myBalance;

    public AccountImpl(int tempID) {
        this.myID = tempID;
        this.myBalance = 0;
    }

    @Override
    public int getId() {
        return this.myID;

    }

    @Override
    public long getBalance() {
        return this.myBalance;
    }

    @Override
    public void deposit(long amount) {

    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {

    }

}
