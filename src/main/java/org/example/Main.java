package org.example;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(inc(number));
        FizzBuzzMethod fb = new FizzBuzzMethod();
        List<String> list = fb.generateFizzBuzzList();
        list.forEach(System.out::println);
    }


    public class FizzBuzzMethod {
        public List<String> generateFizzBuzzList() {
            List<String> result = new ArrayList<>();
            for (int i = 1; i <= 500; i++) {
                if (i % 5 == 0 && i % 7 == 0) {
                    result.add("FizzBuzz");
                } else if (i % 5 == 0) {
                    result.add("Fizz");
                } else if (i % 7 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(Integer.toString(i));
                }
            }
            return result;
        }

    }
    public static int inc(int number){
        return number + 1;
    }
}


