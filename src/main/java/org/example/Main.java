package org.example;
public class Main {
    public static void main(String[] args) {

        Account Andri_Hepaj = new Account(5000);
        Account Anxhelo_Pjetrani = new Account(5000);

        Andri_Hepaj.deposit(10);
        System.out.println("Balance for Account: " + Andri_Hepaj.checkBalance() + "€");

        Anxhelo_Pjetrani.withdraw(100);
        System.out.println("Balance for Account: " + Anxhelo_Pjetrani.checkBalance()+ "€");

        Andri_Hepaj.transfer(Anxhelo_Pjetrani, 200.0);
        System.out.println("Kontostand von Andri Hepaj nach Überweisung: " + Andri_Hepaj.checkBalance() + "€");
        System.out.println("Kontostand von Anhelo Pjetrani nach Empfang: " + Anxhelo_Pjetrani.checkBalance() + "€");

    }
}