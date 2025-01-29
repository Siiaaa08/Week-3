package circularlinkedlist.onlineticketreservation;

public class TicketReservationSystem {
        private Node head;
        private Node tail;
        private int size;

        static class Node {
            int ticketID;
            String customerName;
            String movieName;
            int seatNumber;
            String bookingTime;
            Node next;

            public Node(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
                this.ticketID = ticketID;
                this.customerName = customerName;
                this.movieName = movieName;
                this.seatNumber = seatNumber;
                this.bookingTime = bookingTime;
                this.next = null;
            }
        }

        public TicketReservationSystem() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
            Node newNode = new Node(ticketID, customerName, movieName, seatNumber, bookingTime);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
            size++;
        }

        public void removeTicketByID(int ticketID) {
            if (head == null) {
                System.out.println("No tickets to remove.");
                return;
            }
            Node current = head;
            Node prev = null;

            do {
                if (current.ticketID == ticketID) {
                    if (prev == null) {
                        // Removing the head node
                        head = current.next;
                        tail.next = head;
                    } else {
                        prev.next = current.next;
                        if (current == tail) {
                            tail = prev;
                        }
                    }
                    size--;
                    System.out.println("Ticket with ID " + ticketID + " removed.");
                    return;
                }
                prev = current;
                current = current.next;
            } while (current != head);

            System.out.println("Ticket with ID " + ticketID + " not found.");
        }

        public void displayTickets() {
            if (head == null) {
                System.out.println("No tickets to display.");
                return;
            }
            Node current = head;
            do {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                current = current.next;
            } while (current != head);
        }

        public void searchTicket(String searchTerm) {
            if (head == null) {
                System.out.println("No tickets to search.");
                return;
            }
            Node current = head;
            boolean found = false;
            do {
                if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                    System.out.println("Found Ticket: ID: " + current.ticketID + ", Customer: " + current.customerName +
                            ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                    found = true;
                }
                current = current.next;
            } while (current != head);

            if (!found) {
                System.out.println("No ticket found for search term: " + searchTerm);
            }
        }

        public int getTotalTickets() {
            return size;
        }


    }


