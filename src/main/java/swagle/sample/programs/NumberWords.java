package swagle.sample.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberWords {

    // the array elements should be in below specified order
    private static final List<String> WORDS = Arrays.asList("ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE");

    public static void main(String[] args) {
        System.out.println("Start-----");

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        convertNumberToWords_LongInput(number);
    }

    private static void convertNumberToWords_LongInput(Long number) {

        String numInWords = "";
        List<Integer> reverseNum = new ArrayList<>();

        while(number != 0) {
            int digit = (int) (number % 10);
            reverseNum.add(digit);
            number /= 10;
        }

        int size = reverseNum.size();

        for (int i=size-1; i >=0; i--) {
            numInWords = numInWords + WORDS.get(reverseNum.get(i)) + " ";
        }
        System.out.println("Number in words: " + numInWords);
    }
}