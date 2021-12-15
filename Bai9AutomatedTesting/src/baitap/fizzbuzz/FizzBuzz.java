package baitap.fizzbuzz;

public class FizzBuzz {
    public static String translate(int number) {
        int[] numArr = {0,1,2,4,6,7,8,9};
        String[] numOfCharArr = {"không","một","hai","bốn","sáu","bảy","tám","chín"};
        String stringOfNumber = String.valueOf(number);
        String tranString = "";
        for (int i = 0; i < stringOfNumber.length(); i++) {
            if (String.valueOf(stringOfNumber.charAt(i)).equals("3")) {
                tranString = tranString + "Fizz";
                if (String.valueOf(stringOfNumber.charAt(i)).equals("5"))
                    tranString += "Buzz";
            } else if (Integer.parseInt ( String.valueOf(stringOfNumber.charAt(i))) % 5 == 0)
                tranString += "Buzz";
            else {
                for (int j = 0; j < numArr.length; j++) {
                    if(String.valueOf(stringOfNumber.charAt(i)).equals(String.valueOf(numArr[j])))
                        tranString += numOfCharArr[j];
                }
            }
        }
        return tranString;
    }
}
