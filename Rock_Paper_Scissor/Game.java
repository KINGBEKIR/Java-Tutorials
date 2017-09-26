/**
 * Created by BEKIR on 26.09.2017.
 */
public class Game {

    private final int ROCK = 0;
    private final int PAPER = 1;
    private final int SCISSOR = 2;

    public void startGame() {

        Player player1 = new Player(false);
        Player player2 = new Player(false);

        boolean gameRunning = true;

        while(gameRunning) {

            player1.choose();
            player2.choose();
            checkWinner(player1 , player2);
        }
    }

    private void checkWinner(Player p1, Player p2) {

        if(p1.getChoose() == PAPER && p2.getChoose() == ROCK) {
            System.out.println("Player 1 wins");
        }
        if(p1.getChoose() == PAPER && p2.getChoose() == SCISSOR) {
            System.out.println("Player 2 wins");
        }
        if(p1.getChoose() == SCISSOR && p2.getChoose() == ROCK) {
            System.out.println("Player 2 wins");
        }
        if(p1.getChoose() == SCISSOR && p2.getChoose() == PAPER) {
            System.out.println("Player 1 wins");
        }
        if(p1.getChoose() == ROCK && p2.getChoose() == PAPER) {
            System.out.println("Player 2 wins");
        }
        if(p1.getChoose() == ROCK && p2.getChoose() == SCISSOR) {
            System.out.println("Player 1 wins");
        }
        if(p1.getChoose() == p2.getChoose()) {
            System.out.println("draw");
        }

    }
}
