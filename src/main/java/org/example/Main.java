package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(
                "AeroportFrom1",
                "AeroportTo1",
                1000,
                9,
                10
        );
        Ticket ticket2 = new Ticket(
                "AeroportFrom2",
                "AeroportTo2",
                1500,
                9,
                15
        );

        TicketTimeComparator timeComparator = new TicketTimeComparator();
        Ticket[] tickets = {ticket1, ticket2};
        Arrays.sort(tickets, timeComparator);

    }
}