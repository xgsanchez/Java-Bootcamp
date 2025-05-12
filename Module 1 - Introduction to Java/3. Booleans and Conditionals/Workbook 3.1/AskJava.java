    public class AskJava {
    public static void main(String[] args) {
  
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

  
        double change = 3.50;
        double price = 2.50;

        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + ("<compare change and price>") + "\n");
                                        //comparison here
        if (change >= price) {
            System.out.println("yes, u do");
        }

        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + ("<compare capacity and people>") + "\n");
                                        //comparison here
        if(capacity<= people) {
            System.out.println("yes, it can");
        }

        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + "<compare request and purchase>" + "\n");
                                        //comparison here
        if(request.equals(purchase)) {
            System.out.println("yes, he will be");
        }

        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + "<compare space and guests>" + "\n");
                                        //comparison here
        if(guests <= space){
            System.out.println("yes, everyone can");
        }

        int yourVotes = 24;
        int competitorVotes = 43;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + "<compare your votes and competitor>" + "\n");
                                        //comparison here

        if(yourVotes > competitorVotes) {
            System.out.println("yes, you will");
        }

    }
}
