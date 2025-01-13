package com.fullheap.bingo90;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SeedTest {


    @Test
    public void randomiseTest() {

        // given
        // when
        Seed seed = new Seed();
        seed.randomise();
        //then
        for (int j = 0; j < 9; j++) {
            int vertCount = 0;
            for (int i = 0; i < 18; i++) {
                assertThat(seed.local[i]).filteredOn(v -> v).hasSize(5);

                if (seed.local[i][j]) {
                    vertCount++;
                }
            }
            if (j == 0) {
                assertThat(vertCount).isEqualTo(9);
            }
            if (j >0 && j<8) {
                assertThat(vertCount).isEqualTo(10);
            }
            if (j ==8) {
                assertThat(vertCount).isEqualTo(11);
            }
        }

    }
}
