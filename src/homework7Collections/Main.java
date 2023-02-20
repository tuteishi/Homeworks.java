package homework7Collections;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static <numbers> void main(String[] args) {

        MyArrayList<Integer> numbers = new MyArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println(numbers.remove(5));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(3));
        System.out.println(numbers.add(3, 22555));
        System.out.println(numbers.set(2, 25444));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.get(3));
        System.out.println(numbers);
    }
}