package kuksFunc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class kuksFileSearch {
    public static void main(String[] args) {
        // file path
        String filePath = "/Users/kukvly/kuksDev/javascript/kuksnodejs/kukssns/views/";
       
        // file name
        String fileName = "main.html";

        // string to check
        String[] stringsToCheck = {"Kuks"};
        int lineCnt = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath+fileName))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                for (String target : stringsToCheck) {
                    if (line.contains(target)) {
                        System.out.println(lineCnt + ". " + target + " (Y)");
                    } else
                    	lineCnt++;
                    	System.out.println(lineCnt + ". " + target + " (N)");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Total line: " + lineCnt);
    }
}
