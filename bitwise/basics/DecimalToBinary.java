package bitwise.basics;

import java.util.*;
import java.io.*;
import java.util.stream.*;

import assertion.Assertion;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-8));

        // Test cases
        Assertion.assertEquals(Integer.toBinaryString(8), DecimalToBinary.toBinary(8));
        Assertion.assertEquals("1000", DecimalToBinary.toBinary(4));

    }

    static String toBinary(int num) {
        // System.out.println(num);
        if (num == 0) {
            return "0";
        }
        String binary = "";
        while (num != 1) {
            // System.out.println(num+"\t"+num%2);
            binary = (num % 2) + binary;
            num = num / 2;
        }

        return "1" + binary;
    }

}