
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Toistuvat {

    public static void main(String[] args) {
        // Etsi useiten toistuva kolmen merkin osajono annetusta merkkijonosta. 
        // Esimerkiksi merkkijonossa XXABCABCABCABC
        // useiten toistuva on ABC, kun taas merkkijonossa
        // DEFDEFDEFABCDEFABCDEFABCDAABCD se on DEF

        // Toteuta ohjelma metodiin
        // kolmenMittainenToisto(String syote)
        // esim. 
        System.out.println(kolmenMittainenToisto("CDAGDAGCDAGDAA"));
        // tulostaa DAG

        // ja
        // esim. 
        System.out.println(kolmenMittainenToisto("XXABABABAB"));
        // tulostaa ABA

        // jos yhtä monta kertaa esiintyviä kolmen merkin pituisia merkkijonoja
        // on useampia, palauta niistä aakkosjärjestyksessä ensimmäinen, esim.
        System.out.println(kolmenMittainenToisto("WORKWORKWORKWO"));
        // tulostaa KWO
    }

    public static String kolmenMittainenToisto(String syote) {
        // BEGIN STUB: return syote;
        // BEGIN SOLUTION
        Map<String, Integer> kolmenMittaisetMerkkijonot = new HashMap<>();
        for (int i = 0; i + 3 <= syote.length(); i++) {
            String pala = syote.substring(i, i + 3);
            if (!kolmenMittaisetMerkkijonot.containsKey(pala)) {
                kolmenMittaisetMerkkijonot.put(pala, 0);
            }

            kolmenMittaisetMerkkijonot.put(pala, kolmenMittaisetMerkkijonot.get(pala) + 1);
        }

        int pisin = kolmenMittaisetMerkkijonot.values().stream().mapToInt(i -> i).max().getAsInt();
        List<String> kandidaatit = kolmenMittaisetMerkkijonot.keySet().stream().filter(k -> kolmenMittaisetMerkkijonot.get(k) == pisin).collect(Collectors.toList());
        Collections.sort(kandidaatit);

        return kandidaatit.get(0);
        // END SOLUTION
    }
}
