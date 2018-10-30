package cscie55.hw4.bank;

import java.util.HashMap;

public class BankImpl implements Bank {

    HashMap<Integer, Account> bankMap = new HashMap<>();


    /**
     * Checks for Duplicate Account before adding
     * @param account
     * @throws DuplicateAccountException
     */
    @Override
    public void addAccount(Account account) throws DuplicateAccountException {
        if(this.bankMap.containsKey(account.getId())) {
            throw new DuplicateAccountException(account.getId());
        }
        else {
            this.bankMap.put(account.getId(), account);
        }
    }

    /**
     * Threading with no locking
     * @param fromId
     * @param toId
     * @param amount
     * @throws InsufficientFundsException
     */
    @Override
    public void transferWithoutLocking(int fromId, int toId, long amount) throws InsufficientFundsException {
        this.bankMap.get(fromId).withdraw(amount);
        this.bankMap.get(toId).deposit(amount);
    }

    /**
     * Locks the Bank for threading
     * @param fromId
     * @param toId
     * @param amount
     * @throws InsufficientFundsException
     */
    @Override
    public void transferLockingBank(int fromId, int toId, long amount) throws InsufficientFundsException {
        synchronized (this) {
            this.bankMap.get(fromId).withdraw(amount);
            this.bankMap.get(toId).deposit(amount);
        }

    }

    /**
     * Locks each account for threading
     * @param fromId
     * @param toId
     * @param amount
     * @throws InsufficientFundsException
     */
    @Override
    public void transferLockingAccounts(int fromId, int toId, long amount) throws InsufficientFundsException {
        Account fromAcct = this.bankMap.get(fromId);
        Account toAcct = this.bankMap.get(toId);

        synchronized (fromAcct) {
            fromAcct.withdraw(amount);
        }

        synchronized (toAcct) {
            toAcct.deposit(amount);
        }
    }

    /**
     * Adds the total balances in the Bank
     * @return
     */
    @Override
    public long getTotalBalances() {
        long sum = 0;
        for (Account a : this.bankMap.values()) {
            sum += a.getBalance();
        }
        return sum;
    }

    /**
     * Gets the total number of accounts in the Bank
     * @return
     */
    @Override
    public int  getNumberOfAccounts() {
        return this.bankMap.size();
    }

}
