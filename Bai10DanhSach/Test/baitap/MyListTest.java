package baitap;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest  {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        System.out.println(listInteger.contains(1));
        System.out.println("---------------------------");
        System.out.println(listInteger.contains(5));
        System.out.println("---------------------------");
        System.out.println(listInteger.size);
        System.out.println("---------------------------");

        for (int i = 0; i < listInteger.size; i++) {
            System.out.println(listInteger.get(i));
        }
        System.out.println("---------------------------");
        listInteger.remove(1);
        for (int i = 0; i < listInteger.size; i++) {
            System.out.println(listInteger.get(i));
        }
        System.out.println("---------------------------");
        MyList<Integer> listInteger1 = new MyList<>();
        listInteger1 = listInteger.clone();

        for (int i = 0; i < listInteger.size; i++) {
            System.out.println(listInteger1.get(i));
        }
        System.out.println("---------------------------");
        listInteger.clear();
        for (int i = 0; i < listInteger.size; i++) {
            System.out.println(listInteger.get(i));
        }

        System.out.println(listInteger.indexOf(1));
    }

}