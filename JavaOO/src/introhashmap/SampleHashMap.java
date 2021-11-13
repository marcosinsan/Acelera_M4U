package introhashmap;

import java.util.HashMap;

public class SampleHashMap {

    public static void main(String[] args) {

        HashMap <Integer, String> pais = new HashMap<Integer, String>();

        // add paises

        pais.put(1, "Brasil");
        pais.put(2, "Argentina");
        pais.put(3, "Uruguai");
        pais.put(4, "Peru");
        pais.put(5, "Venezuela");

        System.out.println(pais);

        // Imprimindo keys

        for(Integer posicao: pais.keySet()) {
            System.out.println(posicao);
        }

        // Imprimindo values

        for (String nomes: pais.values()) {
            System.out.println(nomes);
        }

        // Imprimindo keys e values

        for (Integer chaveValor: pais.keySet()) {
            System.out.println("Keys: " + chaveValor + " Values: " + pais.get(chaveValor));
        }
    }
}
