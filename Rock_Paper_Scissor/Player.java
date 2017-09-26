import java.util.Random;
import java.util.Scanner;

/**
 * Created by BEKIR on 26.09.2017.
 */
public class Player {

    private int choose;
    private boolean bot;

    public Player(boolean isBot) {
        bot = isBot;
    }

    public void choose() {

        if(bot) {
            //bot
            Random r = new Random();
            choose = r.nextInt(3);
            System.out.println("Bot choose: " + choose);
        }
        else {
            //player
            System.out.println("Choose one: Rock(0),Paper(1),Scissor(2)");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt(); // user choose from 0 to 2
        }
    }

    public int getChoose() {
        return choose;
    }
}
