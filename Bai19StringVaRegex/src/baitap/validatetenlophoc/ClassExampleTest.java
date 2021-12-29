package baitap.validatetenlophoc;

import thuchanh.validateaccount.AccountExample;

public class ClassExampleTest {
    private static ClassExample classExample;

    public static final String[] validClass = new String[]{ "C0318G"};
    public static final String[] invalidClass = new String[]{  "M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String account: validClass) {
            boolean isvalid = classExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }

        for (String account: invalidClass) {
            boolean isvalid = classExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
