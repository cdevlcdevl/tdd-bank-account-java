package org.xpdojo.bank;

public class Account {
    private Money balance = new Money(0);

    public void deposit(Money amount)
    {
        balance.setAmount(balance.getAmount() + amount.getAmount());
    }

    public boolean withdraw(Money amount)
    {
        if (balance.getAmount()>=amount.getAmount()) {
            balance.setAmount(balance.getAmount() - amount.getAmount());
            return true;
        }

        return false;
    }

    public boolean transfer(Account account,  Money amount)
    {
        if (withdraw(amount))
        {
            account.deposit(amount);
            return true;
        }

        return false;
    }

    public Money getBalance()
    {
        return balance;
    }
}
