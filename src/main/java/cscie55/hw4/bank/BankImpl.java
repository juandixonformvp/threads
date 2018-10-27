package cscie55.hw4.bank;

public class BankImpl implements Bank {

    @Override
    public void addAccount(Account account) throws DuplicateAccountException {

    }

    @Override
    public void transferWithoutLocking(int fromId, int toId, long amount) throws InsufficientFundsException {

    }

    @Override
    public void transferLockingBank(int fromId, int toId, long amount) throws InsufficientFundsException {

    }

    @Override
    public void transferLockingAccounts(int fromId, int toId, long amount) throws InsufficientFundsException {

    }

    @Override
    public long getTotalBalances() {

    }

    @Override
    public int  getNumberOfAccounts() {

    }

}
