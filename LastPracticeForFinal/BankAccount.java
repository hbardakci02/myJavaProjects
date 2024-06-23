package LastPracticeForFinal;

import java.util.Random;

public class BankAccount {
    public static void main(String[] args) {

    }

}

class Bank {
    private Staff[] stafflist;
    private Account[] accountlist;

    public Bank() {
        stafflist = new Staff[100];
        accountlist = new Account[100];
    }

}

class Staff {
    private String name;
    private int age;
    private int salary;

    public void getRaise(int incSalary) {
        salary = salary + salary * incSalary / 100;
    }

}

class Account {
    private double accountNumber;
    private double amount;

    public Account(double accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withdraw(double decimal) {
        if (amount >= decimal) {
            this.amount -= decimal;
        } else {
            throw new YouDontHaveEnoughMoneyException("You Dont Have Enough Money: ");
        }
    }

    public void deposit(double decimal) {
        if (decimal >= 0) {
            this.amount += decimal;
        } else {
            throw new IllegalArgumentException("Deposit Can not be Negative");
        }
    }

}

class Investment extends Account {

    Random rand = new Random();
    private double interestRate = rand.nextDouble(0.00001, 1);

    public Investment(double interestRate, double accountNumber, double amount) {
        super(accountNumber, amount);
        this.interestRate = interestRate;

    }

    public void accureInterest() {
        setAmount(getAmount() * interestRate);

    }

}

class Manager extends Staff {
    private int countEmployee;

    public void hireStaff() {
        countEmployee++;
    }

    public void fireStaff() {
        countEmployee--;
    }

}

class Teller extends Staff {

}

class Security extends Staff {

}

class Debit extends Account {
    public Debit(double accountNumber, double amount) {
        super(accountNumber, amount);
    }

}

class YouDontHaveEnoughMoneyException extends RuntimeException {
    public YouDontHaveEnoughMoneyException(String message) {
        super(message);
    }

    public String toString() {
        return "YouDontHaveEnoughMoneyException" + getMessage();
    }
}