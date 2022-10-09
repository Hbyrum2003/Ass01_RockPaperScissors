import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String YNResp = "";
        String trash = "";
        boolean done = false;
        do {


            Scanner in = new Scanner(System.in);
            System.out.println("Player A enter your play [R,P,S}");
            String playerA = in.nextLine();
            System.out.println("Player A you said your first move was:" + playerA);
            System.out.println("Player B enter your play [R,P,S]");
            String playerB = in.nextLine();
            System.out.println("PLayer B you said your play was: " + playerB);

//Player A + B = R


            if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock vs Rock, it's a tie!");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper cover Rock, Player A wins!");

            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks scissors! Player B wins!");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers rock! Player B wins!");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors! Player A wins!");

            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R")) {
                System.out.println("It is a tie!");


            }
            //Player A + B = P
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers rock! Player A wins!");

            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper vs Paper. It's a tie! ");

            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Scissors cuts paper! Player B wins!");

            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P")) {
                System.out.println("It is a tie!");

            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers rock! Player A wins!");

            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts paper, Player A wins!");

            }
            //Player a + B =s
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors, Player B wins!");

            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors Cuts paper, Player A wins!");

            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissors vs scissors, it's a tie!");

            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissors cut Paper! Player B wins!");

            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks scissors! Player A wins!");

            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S")) {
                System.out.println("It is a tie!");

            }

            System.out.println("Do you want to play again? [Y/N]");
            YNResp = in.nextLine();
            if (YNResp.equalsIgnoreCase("N")) {
                done = true;
                System.out.println("Thanks for playing!");
                System.exit(0);

            }

        } while (!done);
    }
}
