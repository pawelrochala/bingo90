package com.fullheap.bingo90;

import java.util.Random;

public class Seed {


    static private final Boolean[][] PATTERN = {

            {true, true, false, false, false, false, true, true, true},
            {false, true, true, false, true, true, false, false, true},
            {false, false, true, true, false, true, true, true, false},

            {true, false, true, false, true, false, true, true, false},
            {false, true, false, true, false, true, false, true, true},
            {true, true, false, true, false, true, false, false, true},

            {true, false, true, false, true, true, false, false, true},
            {true, true, false, true, false, false, true, true, false},
            {false, true, false, true, true, false, true, true, false},

            {false, true, false, true, true, true, false, false, true},
            {true, false, true, false, false, true, false, true, true},
            {true, true, false, true, false, false, true, true, false},

            {false, true, true, false, true, true, false, false, true},
            {false, false, false, true, true, true, true, false, true},
            {true, false, true, false, true, false, true, true, false},

            {false, true, true, false, true, false, true, false, true},
            {false, false, true, true, true, true, false, false, true},
            {true, false, true, true, false, false, true, true, false}

    };

    Boolean[][] local;
    Random random = new Random();

    public Seed() {
        local = new Boolean[PATTERN.length][];
        for (int i = 0; i < PATTERN.length; i++) {
            local[i] = PATTERN[i].clone();
        }
    }

    public void randomise() {
        if (random.nextInt(2) % 2 == 0) {
            swap(1, 2);
        }
        if (random.nextInt(2) % 2 == 0) {
            swap(3, 4);
        }
        if (random.nextInt(2) % 2 == 0) {
            swap(5, 6);
        }
        if (random.nextInt(2) % 2 == 0) {
            swap(8, 6);
        }
        if (random.nextInt(2) % 2 == 0) {
            swap(0, 3);
        }
    }

    void swap(int srcCol, int dstCol) {
        Integer first = null;
        Integer second = null;
        for (int i = 0; i < local.length; i++) {
            if (local[i][srcCol] != local[i][dstCol]) {
                if (first == null) {
                    first = i;
                } else if (second == null) {
                    second = i;
                }
            }
        }
        if (first != null && second != null) {
            local[first][srcCol] = !local[first][srcCol];
            local[second][dstCol] = !local[second][dstCol];

            local[first][dstCol] = !local[first][dstCol];
            local[second][srcCol] = !local[second][srcCol];
        }
    }


}
