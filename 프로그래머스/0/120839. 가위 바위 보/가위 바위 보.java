class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        //가위 2 바위 0 보 5
        for(char c1 : rsp.toCharArray()){
            if(c1 =='2')
                answer += '0';
            else if(c1 == '0')
                answer += '5';
            else
                answer += '2';
        }
        return answer;
    }
}