import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String decision = scan.nextLine();

        if(decision.equals("yes")){
        System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
        }else {
            System.out.println("\nOK. Have a nice day!");
        }

        String savings = scan.nextLine();
        String debt = scan.nextLine();


        System.out.println("\nHow many years have you worked for?");
        int numYears = scan.nextInt();


        System.out.println("What is your name?");
        String name = scan.nextLine();
                
               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.
        if (savings.equals("10000") && debt.equals("5000") && numYears > 2) {
            System.out.println("Congratulations " + name + " You have been approved!");
        }else {
            System.out.println("Sorry, you are not eligible for a mortgage.");

        }

        scan.close();
    }
}
