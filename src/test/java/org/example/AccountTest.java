package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

    private Account account1;
    private Account account2;

    @BeforeEach
    void setUp() {
        account1 = new Account(100.0);
        account2 = new Account(50.0);
    }

    @Test
    void deposit() {
        account1.deposit(50.0);
        assertEquals(150.0, account1.checkBalance(), "Balance should be 150.0€ after deposit broke ahh.");

        account1.deposit(-20.0);
        assertEquals(150.0, account1.checkBalance(), "Balance should not change after depositing a negative amount dumahh.");
    }

    @Test
    void withdraw() {
        account1.withdraw(30.0);
        assertEquals(70.0, account1.checkBalance(), "Balance should be 70.0€ after withdrawal bro.");

        account1.withdraw(100.0);
        assertEquals(70.0, account1.checkBalance(), "Balance should not change after attempting to withdraw more than available money bro.");

        account1.withdraw(-10.0);
        assertEquals(70.0, account1.checkBalance(), "Balance should not change after attempting to withdraw a negative amount YUHAHHUAA.");
    }

    @Test
    void checkBalance() {
        assertEquals(100.0, account1.checkBalance(), "Initial balance should be 100.0€. broke boyyy");

        assertEquals(50.0, account2.checkBalance(), "Initial balance of account2 should be 50.0€.");
    }

    @Test
    void transfer() {
        account1.transfer(account2, 50.0);
        assertEquals(50.0, account1.checkBalance(), "Balance of account1 should be 50.0€ after transferring 50.0€.");
        assertEquals(100.0, account2.checkBalance(), "Balance of account2 should be 100.0€ after receiving 50.0€.");

        account1.transfer(account2, 200.0);
        assertEquals(50.0, account1.checkBalance(), "Balance of account1 should remain 50.0€ after failed transfer.");
        assertEquals(100.0, account2.checkBalance(), "Balance of account2 should remain 100.0€ after failed transfer.");

        account1.transfer(account2, -10.0);
        assertEquals(50.0, account1.checkBalance(), "Balance of account1 should remain 50.0€ after invalid transfer.");
        assertEquals(100.0, account2.checkBalance(), "Balance of account2 should remain 100.0€ after invalid (HAHAHAHAHAH) transfer.");
    }
}
