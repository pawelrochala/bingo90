package com.fullheap.bingo90;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersTest {


    @Test
    public void constructor(){
        //given

        //when
        Numbers numbers = new Numbers();

        //then
        assertThat(numbers.numberMap.get(0)).hasSize(9);
        assertThat(numbers.numberMap.get(1)).hasSize(10);
        assertThat(numbers.numberMap.get(8)).hasSize(11);
    }

    @Test
    public void getNumber_firstColumn(){
        //given
        Numbers numbers =new Numbers();

        //when
        List<Integer> actual = numbers.getNumber(0,3);

        //then
        assertThat(numbers.numberMap.get(0)).hasSize(6);
        assertThat(actual).hasSize(3).isSorted();

    }

    @Test
    public void getNumber_lastColumn(){
        //given
        Numbers numbers =new Numbers();

        //when
        List<Integer> actual = numbers.getNumber(8,2);

        //then
        assertThat(numbers.numberMap.get(8)).hasSize(9);
        assertThat(actual).hasSize(2).isSorted();

    }
}
