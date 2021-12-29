package baitap.validatesodienthoai;

import baitap.validatetenlophoc.ClassExample;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;

    public static final String[] validClass = new String[]{ "(84)-(0978489648)"};
    public static final String[] invalidClass = new String[]{  "(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String account: validClass) {
            boolean isvalid = phoneNumberExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }

        for (String account: invalidClass) {
            boolean isvalid = phoneNumberExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
