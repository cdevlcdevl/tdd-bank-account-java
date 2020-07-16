package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public void deposit(int amount)
    {
        balance += amount;
    }

    public boolean withdraw(int amount)
    {
        if (balance>=amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public boolean transfer(Account account,  int amount)
    {
        if (withdraw(amount))
        {
            account.deposit(amount);
            return true;
        }

        return false;
    }

    public int getBalance()
    {
        return balance;
    }
}
