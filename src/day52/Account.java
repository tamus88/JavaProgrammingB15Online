package day52;

public class Account implements Transferable,Comparable<Account> {

protected String name;
private int balance;

public Account(String name,int balance){
    this.name = name;
    this.balance = balance;
}
@Override
public int compareTo(Account otherAccount) {
    if (this.balance > otherAccount.balance) {
        return 1;
    } else if (this.balance < otherAccount.balance) {
        return -1;
    } else {
        return 0;
    }
}
   @Override
    public void transferAll(Account otherAccount) {
        otherAccount.balance+= this.balance;
        this.balance=0;

}

    public int getBalance(){
    return balance;
}
public void deposit(int amount){
    balance+= amount;
}
public void withDraw(int amount){
balance-= amount;
}

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
public boolean isPalindrome(){
    String temp = this.name.toLowerCase().replace(" ","");
   String reverseResult = "";
    for (int i =temp.length()-1; i >=0 ; i--) {
        reverseResult+=temp.charAt(i);
    }

    return temp.equals(reverseResult);
}

}
