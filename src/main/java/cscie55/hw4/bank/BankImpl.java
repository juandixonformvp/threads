package cscie55.hw4.bank;

import java.util.HashMap;
import java.util.Map;

public class BankImpl implements Bank {

    HashMap<Integer, Account> bankMap = new HashMap<>();

//    public BankImpl() {
//
//    }

    @Override
    public void addAccount(Account account) throws DuplicateAccountException {
        if(this.bankMap.containsKey(account.getId())) {
            throw new DuplicateAccountException(account.getId());
        }
        else {
            this.bankMap.put(account.getId(), account);
        }
    }

    @Override
    public void transferWithoutLocking(int fromId, int toId, long amount) throws InsufficientFundsException {
        this.bankMap.get(fromId).withdraw(amount);
        this.bankMap.get(toId).deposit(amount);
    }

    @Override
    public void transferLockingBank(int fromId, int toId, long amount) throws InsufficientFundsException {
        synchronized (this) {
            this.bankMap.get(fromId).withdraw(amount);
            this.bankMap.get(toId).deposit(amount);
        }

    }

    @Override
    public void transferLockingAccounts(int fromId, int toId, long amount) throws InsufficientFundsException {
//        Account fromAcct = this.bankMap.get(fromId);
//        Account toAcct = this.bankMap.get(toId);
//
//        synchronized (fromAcct) {
//            fromAcct.withdraw(amount);
//        }
//
//        synchronized (toAcct) {
//            toAcct.withdraw(amount);
//        }
    }

    @Override
    public long getTotalBalances() {
        long sum = 0;
        for (Account a : this.bankMap.values()) {
            sum += a.getBalance();
        }
        return sum;
    }

    @Override
    public int  getNumberOfAccounts() {
        return this.bankMap.size();
    }

}
