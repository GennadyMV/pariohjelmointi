// BEGIN SOLUTION 

import java.util.Scanner;
// END SOLUTION

public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        // BEGIN SOLUTION
        Lentokentta lentokentta = new Lentokentta();
        Scanner lukija = new Scanner(System.in);
        lentokentta.kaynnista(lukija);
        // END SOLUTION
    }
}
