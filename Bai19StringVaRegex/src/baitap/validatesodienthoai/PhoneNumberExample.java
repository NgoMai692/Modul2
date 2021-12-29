package baitap.validatesodienthoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONENUMBER_REGEX = "^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";

    public PhoneNumberExample() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
