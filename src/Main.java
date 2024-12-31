import java.util.Scanner;

public class Main {

    // Main class to run the program
    public static void main(String[] args) {
        // Create instances of Sport class
        Sport sport1 = new Sport("Football", 11);
        Sport sport2 = new Sport("Tennis", 2);

        // Create instances of Player class
        Player player1 = new Player("John Doe", 25, sport1, 5);
        Player player2 = new Player("Jane Smith", 22, sport2, 3);

        // Create instances of SportsClub class
        SportsClub club1 = new SportsClub("Elite Sports Club", "New York", 200);
        SportsClub club2 = new SportsClub("Champion Club", "Los Angeles", 150);

        // Output details to the console
        System.out.println(sport1);
        System.out.println(sport2);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(club1);
        System.out.println(club2);

        // Compare players
        if (player1.getExperience() > player2.getExperience()) {
            System.out.println(player1.getName() + " is more experienced than " + player2.getName());
        } else if (player1.getExperience() < player2.getExperience()) {
            System.out.println(player2.getName() + " is more experienced than " + player1.getName());
        } else {
            System.out.println(player1.getName() + " and " + player2.getName() + " have the same experience.");
        }

        // Compare clubs
        if (club1.getMembers() > club2.getMembers()) {
            System.out.println(club1.getName() + " has more members than " + club2.getName());
        } else if (club1.getMembers() < club2.getMembers()) {
            System.out.println(club2.getName() + " has more members than " + club1.getName());
        } else {
            System.out.println(club1.getName() + " and " + club2.getName() + " have the same number of members.");
        }
    }
}