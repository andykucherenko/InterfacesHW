import org.example.AviaSouls;
import org.example.Ticket;
import org.example.TicketTimeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class AviaSoulsTest {
    Ticket ticket1 = new Ticket("AeroportFrom1", "AeroportTo1", 1000, 9, 10);
    Ticket ticket2 = new Ticket("AeroportFrom1", "AeroportTo2", 1500, 9, 15);
    Ticket ticket3 = new Ticket("AeroportFrom1", "AeroportTo3", 2000, 9, 17);
    Ticket ticket4 = new Ticket("AeroportFrom1", "AeroportTo4", 3000, 9, 19);
    Ticket ticket5 = new Ticket("AeroportFrom1", "AeroportTo5", 2500, 9, 21);

    @Test
    public void shouldCompareTo() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);

        Ticket[] tickets = { ticket4, ticket5 };
        Arrays.sort(tickets);

        Ticket[] expected = { ticket5, ticket4 };

        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void shouldSearch() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);


        Ticket[] tickets = { ticket1, ticket2, ticket3, ticket4, ticket5 };
        Ticket[] expected = { ticket1, ticket2, ticket3, ticket5, ticket4 };

        Arrays.sort(tickets);
        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void shouldCompareTime() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = { ticket1, ticket5 };
        Arrays.sort(tickets, timeComparator);

        Ticket[] expected = { ticket1, ticket5 };


        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void shouldSearchAndSortByTimeFlight() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = { ticket1, ticket2, ticket3, ticket4, ticket5 };
        Arrays.sort(tickets, timeComparator);

        Ticket[] expected = { ticket1, ticket2, ticket3, ticket4, ticket5 };

        Assertions.assertArrayEquals(expected, tickets);
    }
}
