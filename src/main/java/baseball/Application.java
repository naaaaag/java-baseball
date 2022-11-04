package baseball;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {

        String numberComputer = Input.computer();
        System.out.println(numberComputer);
        boolean notThreeStrikes = true;

        do {
            String numberPlayer = Input.player();
            System.out.println(numberPlayer);

            PlayingBaseball round = new PlayingBaseball(numberComputer, numberPlayer);
            System.out.println(round.countStrikes());
            System.out.println(round.countBalls());
            round.printResult();
            notThreeStrikes = !round.has3Strikes();
        } while (notThreeStrikes);

        }
    }
