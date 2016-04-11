import java.util.ArrayList;
import java.util.List;

public class Huoltoreitti {

    public static void main(String[] args) {
        // Kaksiulotteisessa tasossa on joukko öljynporaustorneja, joiden välillä
        // ajaa huoltoauto.
        // 
        // Mitä reittiä huoltoauton kannattaa ajaa, jotta se ei kulje turhan pitkää reittiä?
        // Huoltoauton tulee käydä jokaisella tornilla, ja
        // se aloittaa ensimmäisestä tornista. 

        // Toteuta reitin laskeva ohjelma metodiin
        // huoltoreitti(List<Integer> tornit). Metodi saa parametrina listan lukuja:
        // ensimmäinen luku on ensimmäisen tornin x-koordinaatti, toinen luku ensimmäisen tornin y-koordinaatti
        // kolmas luku toisen tornin x-koordinaatti jne.
        // esim.
        List<Integer> tornit = new ArrayList<>();
        tornit.add(3);
        tornit.add(2);
        tornit.add(3);
        tornit.add(5);
        System.out.println(huoltoreitti(tornit));
        // palauttaa listan muodossa [3, 2, 3, 5]

        // toinen esim
        tornit = new ArrayList<>();
        tornit.add(3);
        tornit.add(2);
        tornit.add(3000);
        tornit.add(3000);
        tornit.add(3);
        tornit.add(5);
        System.out.println(huoltoreitti(tornit));
        // palauttaa listan muodossa [3, 2, 3, 5, 3000, 3000]
    }

    public static List<Integer> huoltoreitti(List<Integer> tornit) {
        // STUB: return tornit;
        // BEGIN SOLUTION
        List<Piste> pisteet = new ArrayList<>();
        for (int i = 0; i < tornit.size(); i += 2) {
            pisteet.add(new Piste(tornit.get(i), tornit.get(i + 1)));
        }

        List<Piste> reitti = new ArrayList<>();
        reitti.add(pisteet.remove(0));

        while (!pisteet.isEmpty()) {
            Piste lyhin = pisteet.get(0);
            for (Piste piste : pisteet) {
                if (reitti.get(reitti.size() - 1).etaisyys(lyhin) > reitti.get(reitti.size() - 1).etaisyys(piste)) {
                    lyhin = piste;
                }
            }

            reitti.add(lyhin);
            pisteet.remove(lyhin);
        }

        List<Integer> palautus = new ArrayList<>();
        for (Piste piste : reitti) {
            palautus.add(piste.getX());
            palautus.add(piste.getY());
        }

        return palautus;
        // END SOLUTION
    }
}