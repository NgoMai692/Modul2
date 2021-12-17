package baitap.reversearrayusingstack;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseArray<T> {
    static ArrayList<Integer> integerArr = new ArrayList<>();
    static String string = "abcdef";
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Character> stack2 = new Stack<>();
    static ArrayList<Character> arr = new ArrayList<>();
    public ReverseArray() {
    }

    public ReverseArray(ArrayList<Integer> integerArr, String str) {
        ReverseArray.integerArr = integerArr;
        string = str;
    }

    public static void creatInteger(){
        integerArr.add(1);
        integerArr.add(2);
        integerArr.add(3);
        integerArr.add(4);
        integerArr.add(5);
    }

    public static ArrayList<Character> creatString(){

        for (int i = 0; i < string.length(); i++) {
            arr.add(string.charAt(i));
        }
        return arr;
    }


    public static void displayArray(){
        for (int o: integerArr) {
            System.out.print(o);
        }
        System.out.println("-----------------");

        for (char o: arr) {
            System.out.print(o);
        }
    }
    public static void main(String[] args) {

        creatInteger();
        displayArray();
        creatString();
        for (Integer o : integerArr) {
            stack1.push(o);

        }

        for (Character o: arr) {
            stack2.push(o);
        }

        System.out.println(stack1);
        System.out.print(stack2);
        System.out.println("-----------------");
        System.out.println(stack1.size());
        System.out.println("-----------------");

        while (stack1.size() != 0){
            System.out.println(stack1.pop());
        }

        while (stack2.size() != 0){
            System.out.println(stack2.pop());
        }
        System.out.println("-----------------");
        System.out.println(stack1);
        System.out.print(stack2);
    }



}
