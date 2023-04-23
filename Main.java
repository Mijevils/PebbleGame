import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the PebbleGame!!"
                + "\n" + "You will be asked to enter the number of players and also the location of 3 files " + "\n" +
                "containing comma separated integer values for the pebble weights. The integer values must be strictly positive." + "\n" +
                "The game will then be simulated, and the output will be written to files in this directory. " + "\n" + "\n" +
                "Please enter the number of players: ");
        Scanner Scanner1 = new Scanner(System.in);
        String players = Scanner1.nextLine();
        int foo = Integer.parseInt(players);
        boolean isInt = false;

        while (isInt = false) {
            try {
                foo = Integer.parseInt(players);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Input String cannot be parsed to Integer.");
            }

            System.out.println("Invalid number of players. Please enter a non-zero natural number. ");
            players = Scanner1.nextLine();

            while (foo < 1) {
                System.out.println("Invalid number of players. Please enter a non-zero natural number. ");
                players = Scanner1.nextLine();
            }
        }

    }
    }
