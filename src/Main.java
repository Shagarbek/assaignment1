
public class Main {

    // Main class to run the program
    public static void main(String[] args) {

        // Create instances of Sport class
        Sport sport1 = new Sport("Football", 11);
        Sport sport2 = new Sport("Tennis", 2);

        // Create instances of Player class
        Player player1 = (new Player("John Doe", 22, sport1, 5));
        Player player2 = new Player("Jane Smith", 22, sport2, 3);

        // Create instances of SportsClub class
        SportsClub club1 = new SportsClub("Tomenaryk Sports Club", "Kyzylorda", 200);
        SportsClub club2 = new SportsClub("223 Club", "Tomenaryk", 150);

        DataPool<Sport> sportPool = new DataPool<>();
        DataPool<Player> playerPool = new DataPool<>();
        DataPool<SportsClub> clubPool = new DataPool<>();

        // Add items to the data pools
        sportPool.addItem(sport1);
        sportPool.addItem(sport2);

        playerPool.addItem(player1);
        playerPool.addItem(player2);

        clubPool.addItem(club1);
        clubPool.addItem(club2);

        // Output details of all sports
        System.out.println("All Sports:");
        sportPool.getAllItems().forEach(System.out::println);

        // Output details of all players
        System.out.println("\nAll Players:");
//        playerPool.getAllItems().forEach(System.out::println);

        // Output details of all sports clubs
        System.out.println("\nAll Sports Clubs:");
        clubPool.getAllItems().forEach(System.out::println);


        // filtering (Sports with more than 5 players)
        System.out.println("\nSports with more than 5 players:");
        sportPool.filterItems(sport -> sport.getTeamSize() > 5).forEach(System.out::println);

        // sorting players by experience (descending)
        System.out.println("\nPlayers sorted by experience (descending):");
        playerPool.sortItems((p1, p2) -> Integer.compare(p2.getExperience(), p1.getExperience()));
        playerPool.getAllItems().forEach(System.out::println);

        // searching for a club with more than 200 members
        System.out.println("\nClub with more than 200 members:");
        SportsClub foundClub = clubPool.findItem(club -> club.getMembers() > 200);
        System.out.println(foundClub);

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
