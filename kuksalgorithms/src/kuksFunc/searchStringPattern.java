package kuksFunc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class searchStringPattern {

    public static void main(String[] args) {
        String filePath = "your_file_path.txt"; // 텍스트 파일 경로를 지정해야 합니다.

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // 정규표현식 패턴: 네 자리 숫자;네 자리 숫자
            Pattern pattern = Pattern.compile("\\b(?!8020;9080|9020;9021|9080;8001;8002)\\d{4};\\d{4}\\b");

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                // 패턴과 일치하는 부분이 있다면 출력
                while (matcher.find()) {
                    System.out.println("Found: " + matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}