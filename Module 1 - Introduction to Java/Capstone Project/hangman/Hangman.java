import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {


    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};


    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};


    static public char[] randomWord(){
        double randomN = Math.random() * words.length + 1;
        int randomN1 = (int) randomN;

        String myWord = words[randomN1];
        return myWord.toCharArray();

    }

    static public boolean checkGuess(char guess, char[] word){
          for (int i = 0; i < word.length; i++) {
              if (guess == word[i]) {
                  return true;
              }
          }
        return false;
    }

    static public char[] updatePlaceholders( char[] placeholders, char guess){
        for (int i =0; i<placeholders.length; i ++){
            if (guess == placeholders[i]){
                placeholders[i] = guess;
            }
        }
        return placeholders;
    }

    static public void printPlaceholders(char[] placeholders){
        for (int i = 0; i < placeholders.length; i++) {
            placeholders[i] = '_';
            System.out.print(placeholders[i] + " ");
            }

        }
//        System.out.print("\n");


    static public void printMissedGuesses(char[] misses){
        for (int i = 0; i < misses.length; i++) {
            System.out.print(misses[i]);
        }
    }


    public static void main(String[] args) {
        char guess;

        Scanner scan = new Scanner(System.in);



        System.out.print("Word:  ");
        char[] placeholder = randomWord();
        System.out.println(placeholder);
        printPlaceholders(placeholder);




        System.out.println("\n");
        System.out.println("Misses:  ");
        char[] missedGuesses =  new char[6];



        System.out.print("\nGuess:  ");
        guess = scan.nextLine().charAt(0);



        for (int i =0; i<placeholder.length -1; i++) {
            guess = scan.nextLine().charAt(0);
            char[] actualizacion = updatePlaceholders(placeholder, guess);
            printPlaceholders(actualizacion);
        }
//        if (checkGuess(guess, placeholder)) {
//            updatePlaceholders(placeholder, guess);
//        }
////        checkGuess(guess, placeholder);

//        for (int i = 0; i < placeholder.length; i++) {
//            if (guess == placeholder[i] ){
//                updatePlaceholders( randomWord(), word, guess);
//            }else {
//                printMissedGuesses(guess);
//            }
//        }
//




    }

}





