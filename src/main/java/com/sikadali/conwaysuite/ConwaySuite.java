package com.sikadali.conwaysuite;

import java.util.ArrayList;
import java.util.List;

public class ConwaySuite {
    public static final String FIRST_TERM = "1";
    public static final String SPACE_SEPARATOR = " ";
    public static final String EMPTY_STRING = "";
    private List<String> lines = new ArrayList<>(List.of(FIRST_TERM));
    public void printSequence(int numberLines) {
        throw new UnsupportedOperationException();
    }

    public List<String> getLines() {
        return lines;
    }

    public String generateNext(String line) {
        String compressedLine = line.replaceAll(SPACE_SEPARATOR, EMPTY_STRING);

        if (compressedLine.length() > 1) {
            return generateForIdenticalNumbers(compressedLine.substring(0, 1))
                    + SPACE_SEPARATOR
                    + generateForIdenticalNumbers(compressedLine.substring(1));
        }
        return generateForIdenticalNumbers(compressedLine);
    }

    private static String generateForIdenticalNumbers(String compressedLine) {
        return compressedLine.length() + SPACE_SEPARATOR + compressedLine.charAt(0);
    }
}
