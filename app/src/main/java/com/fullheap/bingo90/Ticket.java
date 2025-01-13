package com.fullheap.bingo90;

import java.util.HashMap;
import java.util.List;

public class Ticket {

    public static final int COLUMNS = 9;
    public static final int ROWS = 3;

    HashMap<Integer, List<Integer>> numberMap = new HashMap<>(COLUMNS);
    boolean[][] tfTable = new boolean[ROWS][COLUMNS];

    public Ticket(Boolean[][] seedPattern, int row, Numbers numbers) {
        for (int j = 0; j < COLUMNS; j++) {
            int trueCount = 0;
            for (int i = row; i < row + ROWS; i++) {
                if (seedPattern[i][j]) {
                    trueCount++;
                    tfTable[i - row][j] = true;
                }
            }
            List<Integer> numbs = numbers.getNumber(j, trueCount);
            numberMap.put(j, numbs);
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            sb.append("[");
            for (int j = 0; j < COLUMNS; j++) {
                if (tfTable[i][j]) {
                    List<Integer> numList = numberMap.get(j);

                    sb.append(numList.getFirst() + ",");
                    numList.removeFirst();
                } else {
                   if(j==0){
                        sb.append(" ,");
                    }else {
                        sb.append("  ,");
                    }
                }

            }
            sb.append("]");
            sb.append("\n");
        }
        return sb.toString();
    }
}
