package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Transferable {

    public abstract void transferAll(Account otherAccount);


    public static void main(String[] args) {

        Account a1 = new Account("Tamara",20000);
        Account a2 = new Account("Hannah",30000);
        System.out.println("a1 = " + a1);
        a2.transferAll(a1);
        System.out.println("a2 = " + a2);
        System.out.println(a2.isPalindrome());
        System.out.println(a1.compareTo(a2));
        System.out.println(a2.compareTo(a1));

        List<Account> accountlst= new ArrayList<>(Arrays.asList(a1,a2));
        accountlst.add(new Account("Jon Snow",5000));
        accountlst.add(new Account("Malika",8000));
        Collections.sort(accountlst);
        System.out.println("accountlst = " + accountlst);

        Account myAccount = new Account("Tomych",0);
        for (Account each :accountlst) {
            each.transferAll(myAccount);

        }
        System.out.println("myAccount = " + myAccount);

        Transferable t1 = a1;
        Object o1 = new Account("Polymorphism",3000);
        Comparable c1 = new Account("Polymorphism2",2000);
        c1.compareTo(t1);
    }
}