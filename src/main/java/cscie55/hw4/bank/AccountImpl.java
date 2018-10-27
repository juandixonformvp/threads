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
        if(amount <= 0){
            throw new IllegalArgumentException("Cannot be a zero or negative value");
        }
        else {
            this.myBalance = this.myBalance + amount;
        }

    }

    @Override
    public void withdraw(long amount) throws InsufficientFundsException {
        if(amount <= 0){
            throw new IllegalArgumentException("Cannot be a zero or negative value");
        }
        else {
            if(this.myBalance - amount >= 0) {
                this.myBalance = this.myBalance - amount;
            }
            else {
                throw new InsufficientFundsException(this, amount);
            }

        }

    }

}
