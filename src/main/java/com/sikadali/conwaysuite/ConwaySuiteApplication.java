package com.sikadali.conwaysuite;

public class ConwaySuiteApplication {
    public static void main(String[] args) {
        Console console = new Console();
        ConwaySuite conwaySuite = new ConwaySuite(console);
        conwaySuite.printSequence(10);
    }
}
