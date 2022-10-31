package com.sikadali.conwaysuite;

import java.util.Scanner;

public class ConwaySuiteApplication {
    public static void main(String[] args) {
        Console console = new Console();
        ConwaySuite conwaySuite = new ConwaySuite(console);

        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines do you want ??");
        conwaySuite.printSequence(sc.nextInt());
    }
}
