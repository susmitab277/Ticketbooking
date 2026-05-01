import java.util.*;

class CricketMatch {
    private String matchDetails;
    private int availableTickets;

    public CricketMatch(String matchDetails, int availableTickets) {
        this.matchDetails = matchDetails;
        this.availableTickets = availableTickets;
    }

    public void displayMatchDetails() {
        System.out.println("Match Details: " + matchDetails);
        System.out.println("Available Tickets: " + availableTickets);
    }

    public boolean bookTickets(int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            availableTickets -= numberOfTickets;
            System.out.println("Successfully booked " + numberOfTickets + " tickets.");
            return true;
        } else {
            System.out.println("Not enough tickets available.");
            return false;
        }
    }
}

public class IplTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CricketMatch match = new CricketMatch("IPL 2026: Team A vs Team B, Date: 2026-05-15, Time: 19:30", 100);
        match.displayMatchDetails();

        System.out.print("Enter number of tickets to book: ");
        int ticketsToBook = scanner.nextInt();
        match.bookTickets(ticketsToBook);

        match.displayMatchDetails();
        scanner.close();
    }
}