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
        if(bankMap.containsKey(account.getId())) {
            throw new DuplicateAccountException(account.getId());
        }
        else {
            bankMap.put(account.getId(), account);
        }
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
