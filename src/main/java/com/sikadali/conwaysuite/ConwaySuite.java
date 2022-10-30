package com.sikadali.conwaysuite;

import java.util.ArrayList;
import java.util.List;

public class ConwaySuite {
    public static final String FIRST_TERM = "1";
    public static final String SPACE_SEPARATOR = " ";
    public static final String EMPTY_STRING = "";
    private List<String> lines = new ArrayList<>(List.of(FIRST_TERM));
    private Console console;

    public ConwaySuite(){}
    public ConwaySuite(Console console) {
        this.console = console;
    }


    public void printSequence(int numberLines) {
        String nextLine = FIRST_TERM;
        console.printLine(nextLine);

        for (int i = 1; i<numberLines; i++) {
            nextLine = generateNext(nextLine);
            console.printLine(nextLine);
        }
    }

    public List<String> getLines() {
        return lines;
    }

    public String generateNext(String line) {
        String compressedLine = line.replaceAll(SPACE_SEPARATOR, EMPTY_STRING);

        return generateForDistinctNumbers(compressedLine, EMPTY_STRING);
    }

    private static String generateForDistinctNumbers(String compressedLine, String accumulator) {
        if (compressedLine.isEmpty()) {
            return accumulator.trim();
        }
        int indexNextDistinctNumber = indexNextDistinctNumber(compressedLine, 0);
        return generateForDistinctNumbers(tailString(compressedLine, indexNextDistinctNumber + 1),
                accumulate(compressedLine, accumulator, indexNextDistinctNumber)
                        + SPACE_SEPARATOR);
    }

    private static int indexNextDistinctNumber(String line, int index) {
        if (hasOnlyOneNumber(line) || nextCharIsDistinct(line)) {
            return index;
        }
        return indexNextDistinctNumber(tailString(line, 1), index+1);
    }

    private static boolean nextCharIsDistinct(String line) {
        return line.charAt(0) != line.charAt(1);
    }

    private static boolean hasOnlyOneNumber(String line) {
        return line.length() == 1;
    }

    private static String tailString(String compressedLine, int indexNextDistinctNumber) {
        return compressedLine.substring(indexNextDistinctNumber);
    }


    private static String accumulate(String line, String accumulator, int indexNextDistinctNumber) {
        return accumulator + countIdenticalNumbers(headString(line, indexNextDistinctNumber));
    }

    private static String headString(String compressedLine, int indexNextDistinctNumber) {
        return compressedLine.substring(0, indexNextDistinctNumber + 1);
    }


    private static String countIdenticalNumbers(String compressedLine) {
        return compressedLine.length() + SPACE_SEPARATOR + compressedLine.charAt(0);
    }
}
