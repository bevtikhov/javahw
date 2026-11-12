package practice_2;

//Создайте класс BankAccount с полями owner и balance. Реализуйте конструктор,
// геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод
// printBalance(). В main внесите деньги, снимите и выведите баланс.


public class BankAccount {
    String owner;
    double balance;
    BankAccount(String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }
    String getOwner(){
        return this.owner;
    }
    double getBalance(){
        return this.balance;
    }
    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void printBalance() {
        System.out.println("Баланс равен: " + balance);
    }
    public static void main (String[] args){
        BankAccount mybankaccount = new BankAccount("Me", 0.0);
        mybankaccount.deposit(50.0);
        mybankaccount.withdraw(25.7);
        mybankaccount.printBalance();
    }

}
