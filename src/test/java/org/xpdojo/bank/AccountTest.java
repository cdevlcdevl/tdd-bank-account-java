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
}
