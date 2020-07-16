package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(20);
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(30);
    }

    @Test
    public void withdrowAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(20);
        assertThat(account.getBalance()).isEqualTo(20);
        account.withdraw(10);
        account.withdraw(20);
        assertThat(account.getBalance()).isEqualTo(10);

    }

    @Test
    public void transferMoneySuccessfully() {
        Account account1 = new Account();
        account1.deposit(20);

        Account account2 = new Account();
        account1.transfer(account2, 10);

        assertThat(account1.getBalance()).isEqualTo(10);
        assertThat(account2.getBalance()).isEqualTo(10);
    }

    @Test
    public void transferMoneyNotEnoughBalance() {
        Account account1 = new Account();
        account1.deposit(20);

        Account account2 = new Account();
        account1.transfer(account2, 30);

        assertThat(account1.getBalance()).isEqualTo(20);
        assertThat(account2.getBalance()).isEqualTo(0);

    }
}
