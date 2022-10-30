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

        return generateForDistinctNumbers(compressedLine);
    }

    private static String generateForDistinctNumbers(String compressedLine) {
        int indexNextDistinctNumber = indexNextDistinctNumber(compressedLine, 0);

        if (indexNextDistinctNumber != compressedLine.length()-1 && compressedLine.length() > 1) {
            return generateForIdenticalNumbers(compressedLine.substring(0, indexNextDistinctNumber+1))
                    + SPACE_SEPARATOR
                    + generateForIdenticalNumbers(compressedLine.substring(indexNextDistinctNumber+1));
        }
        return generateForIdenticalNumbers(compressedLine);
    }

    private static int indexNextDistinctNumber(String line, int index) {
        if (line.length() == 1 || line.charAt(0) != line.charAt(1)) {
            return index;
        }
        return indexNextDistinctNumber(line.substring(1), index+1);
    }
    private static String generateForIdenticalNumbers(String compressedLine) {
        return compressedLine.length() + SPACE_SEPARATOR + compressedLine.charAt(0);
    }
}
