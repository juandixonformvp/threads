package cscie55.hw4.bank;

import java.util.HashMap;
import java.util.Map;

public class BankImpl implements Bank {

    public BankImpl() {
        HashMap<Integer, Account> bankMap = new HashMap<>();
    }

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
