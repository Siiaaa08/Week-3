package circularlinkedlist.onlineticketreservation;

public class Main {
        public static void main(String[] args) {
            TicketReservationSystem system = new TicketReservationSystem();

            system.addTicket(1, "John Doe", "Avengers: Endgame", 12, "2025-01-28 10:00");
            system.addTicket(2, "Alice Smith", "Inception", 8, "2025-01-28 12:00");
            system.addTicket(3, "Bob Johnson", "Spider-Man: No Way Home", 15, "2025-01-28 14:00");

            system.displayTickets();
            system.searchTicket("Alice Smith");

            system.removeTicketByID(2);
            system.displayTickets();

            System.out.println("Total Booked Tickets: " + system.getTotalTickets());
        }

    }


