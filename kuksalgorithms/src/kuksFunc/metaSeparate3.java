package kuksFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class metaSeparate3 {

    public static void main(String[] args) throws IOException {
        List<String> kuksList = new ArrayList<String>();
        kuksList.add("병원");
        kuksList.add("명");
        kuksList.add("구분");
        kuksList.add("코드");
        kuksList.add("종별");
        kuksList.add("모집자");
        kuksList.add("인사");
        kuksList.add("번호");
        kuksList.add("채널");
        kuksList.add("구분");
        kuksList.add("코드1");
        kuksList.add("코드2");
        kuksList.add("피보험자");
        kuksList.add("고객");
        kuksList.add("치료");
        kuksList.add("시작");
        kuksList.add("종료");
        kuksList.add("일자");
        kuksList.add("지급");
        kuksList.add("청구");
        kuksList.add("산출");
        kuksList.add("보험");
        kuksList.add("금액"); // AM
        kuksList.add("금"); // AM
        kuksList.add("면책");
        kuksList.add("결정");
        kuksList.add("마감");
        kuksList.add("월");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        List<String> tokens = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            word.insert(0, c); // 새로운 글자를 앞쪽에 추가
            System.out.println("kuks_chk: "  + word);
            // 만약 현재 글자가 리스트에 포함된다면
            if (kuksList.contains(word.toString())) {
                tokens.add(0, word.toString()); // 리스트 앞쪽에 추가
                word.setLength(0); // StringBuilder 초기화
            }
        }

        // 마지막으로 남은 단어를 추가
        if (word.length() > 0) {
            tokens.add(0, word.toString());
        }

        // 결과 출력
        for (String token : tokens) {
            System.out.print(token + "/");
        }
    }
}