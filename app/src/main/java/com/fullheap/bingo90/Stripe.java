package com.fullheap.bingo90;

import java.util.*;

public class Stripe {

    ArrayList<Ticket> tickets;
    Numbers numbers;

    public Stripe(Seed seed) {
        tickets = new ArrayList<>(6);
        numbers = new Numbers();

        for (int i = 0; i < seed.local.length; i++) {
            Ticket ticket;
            if (i % 3 == 0) {
                seed.randomise();
                ticket = new Ticket(seed.local, i, numbers);
                tickets.add(ticket);
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ticket ticket : tickets) {
            sb.append(ticket.toString());
            sb.append("\n");
        }
        sb.append("----------------------------");
        return sb.toString();
    }
}
