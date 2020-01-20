package practice;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class NonRepatingCharacter {

    public int solution(String s) {
        List<Character> collect = new ArrayList<Character>();
        boolean mainMatch = false;
        int index = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            boolean match = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    match = true;
                    collect.add(s.charAt(i));
                    break;
                }
            }
            if (!match && !collect.contains(s.charAt(i))) {
                mainMatch = true;
                index = i;
                break;
            }
        }
        if (!mainMatch) {
            index = -1;
        }
        return index;
    }

    @Test
    public void mainMethod() {
        String s = "lovelyleetcode";
        System.out.println("The index is " + solution(s));
    }
}
