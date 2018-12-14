package com.company;
import java.util.Scanner;

public class Runner {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int game = 0;
        System.out.println("Type 'start' to begin.");
        String start = input.nextLine();
        if (start.equals("start")) {
            game = 1;
            startMenu();
            input = new Scanner (System.in);
            String stand = input.nextLine();
            if (stand.equals("enter")){
                System.out.println("What will you do?");

                public static String Decisions{
                    int x = 0;
                    int y = 0;
                    int[][] location = new int [10][10];

                    Scanner request1 = new Scanner(System.in);
                    String entry = request1.nextLine();

                if (entry.equals("north")) {

                }
                else if (entry.equals("south")) {

                }
                else if (entry.equals("east")){

                }
                else if (entry.equals("west")){

                }
                }
            }
        }
    }

    public static void startMenu(){
        String instructions = "Welcome to this Text Based Adventure. To move around, type 'North', 'South', 'East' and 'West'.\n" +
                "To check your location, type 'Location'. To check your inventory, type 'Inventory'.\nTo check your health and other effects, type 'Status'." +
                " Answer all other questions with the options provided.\nYour goal is to escape the pit in one piece by any means necessary. Good Luck!";
        String intro = "You wake up in a pit. You can see the sky from where you are," +
                " but its a very long way up. It's hard to imagine surviving a fall from that height," +
                " and yet, your body aches as if you'd fallen into the pit.\nTo the north, there's a massive door that seems" +
                "too heavy to even try to open. West is another pit, no bottom to be seen.\nTo the East, there's" +
                " a long passage, just as dark as the pit to the West. There's a small wooden door to the South.\n"
                + "type 'enter' to stand up";
        System.out.println(instructions);
        System.out.println(intro);
    }
}
