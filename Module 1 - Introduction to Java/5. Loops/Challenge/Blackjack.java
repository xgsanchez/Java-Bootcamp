import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int valueCard1 = drawRandomCard();
        int valueCard2 = drawRandomCard();

        String card1 = cardString(valueCard1);
        String card2 = cardString(valueCard2);

        System.out.println("\n You get a \n" + card1 + "\nand a \n" + card2);


        int yourTotal = Math.min(valueCard1, 10) + Math.min(valueCard2, 10);
        System.out.println("Your total is " + yourTotal);
        


        int valueCardComputer1 = drawRandomCard();
        int valueCardComputer2 = drawRandomCard();
        String cardComputer1 = cardString(valueCardComputer1);
        String cardComputer2 = cardString(valueCardComputer2);

        int computerTotal = Math.min(valueCardComputer1, 10) + Math.min(valueCardComputer2, 10);
        System.out.println("\nThe dealer show \n" + cardComputer1 + "\\and has a card facing down \\n" + faceDown());

        System.out.println("\nThe dealer's total is hidden\n");

        while (true){
            String answer = hitOrStay();
            if (answer.equalsIgnoreCase("hit")){
                int valueCard3 = drawRandomCard();
                String card = cardString(valueCard3);
                System.out.println("\nYou get a \n" + card);
                yourTotal += Math.min(valueCard3,10);

                System.out.println("Your new total is " + yourTotal);

                if (yourTotal > 21){
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
            }else {
                break;
            }
        }

        System.out.println("the Dealer's card is\n" + cardComputer1 + "\nand a \n" + cardComputer2);
        System.out.println("Dealer's total is " + computerTotal);

        while(true){
            if (computerTotal<=17){

                int valueCardComputer3 = drawRandomCard();
                String card = cardString(valueCardComputer3);
                System.out.println("\nDealer gets a \n" + card);
                computerTotal += Math.min(valueCardComputer3, 10);
                System.out.println("Dealer's total is " + computerTotal);

                if (computerTotal > 21){
                    System.out.println("Bust! Dealer loses");
                    System.exit(0);
                }
            }else {
                break;
            }
        }

        if (yourTotal > computerTotal){
            System.out.println("You win");
        } else {
            System.out.println("Dealer wins");
        }
         scan.close();

    }





    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

    public static int drawRandomCard(){
        double random = Math.random() * 13 +1;
        return (int)random;
    }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber){
        switch (cardNumber){
           case 1: return

            "   _____\n"+
                    "  |A _  |\n"+
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";

            case 2: return

            "   _____\n"+
                    "  |2    |\n"+
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";

            case 3: return
            "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";

            case 4: return
            "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";

            case 5: return
            "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6: return
            "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7: return

            "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

            case 8: return

            "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";

            case 9: return
            "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10: return
            "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

            case 11: return

            "   _____\n" +
                    "  |J  ww|\n"+
                    "  | o {)|\n"+
                    "  |o o% |\n"+
                    "  | | % |\n"+
                    "  |__%%[|\n";

            case 12: return

            "   _____\n" +
                    "  |Q  ww|\n"+
                    "  | o {(|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%O|\n";

            case 13: return
            "   _____\n" +
                    "  |K  WW|\n"+
                    "  | o {)|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%>|\n";

        }
        return "si llego aqui, hay un fallo ";
    }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */

    public static String hitOrStay() {

        System.out.println("Would you like to hit or stay");
        String answer = scan.nextLine();

        while (!(answer.equals("hit")||answer.equals("stay"))) {
            System.out.println("Please write hit or stay");
            answer = scan.nextLine();
        }
        return answer;
    }




}

