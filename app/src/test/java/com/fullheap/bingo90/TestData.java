package com.fullheap.bingo90;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestData {

   public static Boolean[][] TEST_PATTERN = new Boolean[][]{
            {true, false, true, false, false, true, false, false, false},
            {false, true, false, true, false, false, true, false, false},
            {true, false, false, false, true, false, false, true, true},
    };


   public static HashMap<Integer, List<Integer>> constNumbers(){
       HashMap<Integer, List<Integer>> mockNumberMap = new HashMap<>();
       for (int i = 0; i < Ticket.COLUMNS; i++) {
           List<Integer> columnNumbers = new ArrayList<>();
           for (int j = 0; j < Ticket.ROWS; j++) {
               int add = i * 10;
               columnNumbers.add((i + 1) +add  + j);

           }
           mockNumberMap.put(i, columnNumbers);

       }
       return mockNumberMap;
   }
}
