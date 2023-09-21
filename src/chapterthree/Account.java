package chapterthree;

public class Account {
    
    private double balance;
    private String name;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double deposit(int amount){
        this.balance = balance + amount;
        return balance;
    }
    public void withdraw(int amount){
        if (amount < balance) {
            this.balance = balance - amount;
        }else {
            System.out.println("insufficient amount");
        }
    }
    public double checkBalance() {
        return this.balance;
    }
}
