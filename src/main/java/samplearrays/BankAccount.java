package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions=new double[1000];
    int transactionsNumber=0;

    public BankAccount(String name, int startingBalance){

    }

    public void deposit(double amount){
        if (amount<=0) System.out.println("Unseccessful deposits");
        currentBalance+=amount;
        transactions[transactionsNumber]=amount;
        transactionsNumber+=1;
        System.out.println("name : " + name +"\ndeposited amount : " + amount + "\nnew balnce : " + currentBalance);
    }

    public void withdraw(double amount){
    }

    public void displayTransactions(){

    }

    public void displayBalance(){

    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
