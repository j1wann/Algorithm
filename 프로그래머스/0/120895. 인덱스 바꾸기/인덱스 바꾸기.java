import java.util.Arrays;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] ansC = my_string.toCharArray();
        
        char temp = ansC[num1];
        ansC[num1] = ansC[num2];
        ansC[num2] = temp;
        
        for(char c : ansC) answer += c;
        return answer;
    }
}