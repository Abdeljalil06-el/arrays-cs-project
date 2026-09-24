package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions=new double[1000];
    int transactionsNumber=0;

    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if (amount<=0) 
            {System.out.println("Unseccessful deposits");}
        else{
            currentBalance+=amount;
            transactions[transactionsNumber]=amount;
            transactionsNumber+=1;
            System.out.println("name : " + name +"\ndeposited amount : " + amount + "\nnew balnce : " + currentBalance);
        }
    }

    public void withdraw(double amount){
        if (amount>currentBalance || amount<=0){
            System.out.println("the withdraw was unsessceful");
        }else{
            currentBalance-=amount;
        transactions[transactionsNumber]=-amount;
        transactionsNumber++;
        System.out.println("withdraw amount : " + amount + "\nnew balnce : " + currentBalance);
        }
    }

    public void displayTransactions(){
        System.out.println("the transactions : \n");
        for (int i=0;i<transactionsNumber;i++){
            System.out.println(transactions[i]);
        }

    }

    public void displayBalance(){
        System.out.println("the current balance : "+ currentBalance);
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
