package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter car name # " + i  + " for List A: ");
            A.add(i, scanner.next());
        }
        System.out.println("A has the following names: " + A);
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter spares name # " + i +  " for List B: ");
            B.add(i, scanner.next());
        }
        System.out.println("A has the following names: " + A);
        System.out.println("B has the following names: " + B);

        ArrayList<String> C = new ArrayList<>();
        C.add(0,A.get(0));
        C.add(1,B.get(4));
        C.add(2,A.get(1));
        C.add(3,B.get(3));
        C.add(4,A.get(2));
        C.add(5,B.get(2));
        C.add(6,A.get(3));
        C.add(7,B.get(1));
        C.add(8,A.get(4));
        C.add(9,B.get(0));
        System.out.println("C sorted out as per task looks as follows: " + C);

        C.sort(Comparator.comparing(String::length));
        System.out.println("List C sorted out by string length looks as follows: " + C);
    }
}