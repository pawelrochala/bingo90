package com.fullheap.bingo90;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicketTest {


    @Test
    public void toStringAndConstructorTest() {
        //given
        int row = 0;
        Seed seed = new Seed();
        seed.local =  TestData.TEST_PATTERN;

        String expected = """
             [1,  ,23,  ,  ,56,  ,  ,  ,]
             [ ,12,  ,34,  ,  ,67,  ,  ,]
             [2,  ,  ,  ,45,  ,  ,78,89,]
             """;

        Ticket ticket = new Ticket(seed.local, row, new Numbers());
        ticket.numberMap = TestData.constNumbers();

        //when
        String actual = ticket.toString();


        //then
        assertThat(actual).isEqualTo(expected);

    }

}
