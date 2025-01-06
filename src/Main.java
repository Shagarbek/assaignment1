import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        Sport basketball = new Sport("Basketball", "Team Sport");

        AtomicReference<BasketballPlayer> basketballPlayer = null;
        basketballPlayer.set(new BasketballPlayer("LeBron James", 40, "Forward", 35000, basketball));

        SportsClub sportsClub = new SportsClub();

        sportsClub.addPlayer(basketballPlayer.get());

        System.out.println("All Players in the Club:");
        sportsClub.displayPlayers();

        System.out.println("\nBasketball Players:");
        List<player> basketballPlayers = sportsClub.getPlayersByPosition("Forward");
        for (player player : basketballPlayers) {
            System.out.println(player);
        }
        System.out.println("\nPlayers Sorted by Name:");
        sportsClub.sortPlayersByName();
        sportsClub.displayPlayers();
    }
}