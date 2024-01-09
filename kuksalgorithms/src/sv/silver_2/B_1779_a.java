package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B_1779_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        // Contractions
        int numContractions = Integer.parseInt(input[0]);
        Map<String, String> contractions = new HashMap<>();
        for (int i = 0; i < numContractions; i++) {
            String[] rule = br.readLine().replaceAll("\"", "").split(" -> ");
            contractions.put(rule[0], rule[1]);
        }

        // Acronyms
        int numAcronyms = Integer.parseInt(input[1]);
        Map<String, String> acronyms = new HashMap<>();
        for (int i = 0; i < numAcronyms; i++) {
            String[] rule = br.readLine().replaceAll("\"", "").split(" -> ");
            acronyms.put(rule[0], rule[1]);
        }

        // Texts
        while (true) {
            String line = br.readLine().replaceAll("\"", "");

            // Check for termination
            if (line.equals("#")) {
                System.out.println("#");
                break;
            }

            // Process contractions
            for (Map.Entry<String, String> entry : contractions.entrySet()) {
                String contraction = entry.getKey();
                String expansion = entry.getValue();

                line = line.replace(contraction, expansion);
                line = line.replace(contraction.toUpperCase(), expansion.toUpperCase());
                line = line.replace(capitalize(contraction), capitalize(expansion));
            }

            // Process acronyms
            for (Map.Entry<String, String> entry : acronyms.entrySet()) {
                String acronym = entry.getKey();
                String expansion = entry.getValue();

                line = line.replaceFirst("\\b" + acronym + "\\b", expansion + " [" + acronym + "]");
                line = line.replaceFirst("\\b" + acronym.toUpperCase() + "\\b", expansion.toUpperCase() + " [" + acronym.toUpperCase() + "]");
                line = line.replaceFirst("\\b" + capitalize(acronym) + "\\b", capitalize(expansion) + " [" + capitalize(acronym) + "]");
            }

            System.out.println(line);
        }
    }

    // Helper method to capitalize the first letter of a word
    private static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}