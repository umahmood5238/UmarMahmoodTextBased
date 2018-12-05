package com.company;
import java.util.Scanner;

public class Runner {
    int game = 0;

    Scanner input = new Scanner (System.in);

    public void main (String[] args){
        System.out.println("Type 'start' to begin.");
        String start = input.nextLine();
        if (start.equals("start")) {
            game = 1;
        }
    }

    public static String startMenu(){
        String intro = "You wake up in a pit. You can see the sky from where you are," +
                " but its a very long way up. It's hard to imagine surviving a fall from that height," +
                " and yet, your body aches as if you'd fallen into the pit. To the north, there's a massive door that seems" +
                "too heavy tp even try to open. West is another pit, no bottom to be seen. To the East, there's" +
                "a long passage, just as dark as the pit to the West. There's a regular wooden door to the South.";
        return intro;
    }
}
