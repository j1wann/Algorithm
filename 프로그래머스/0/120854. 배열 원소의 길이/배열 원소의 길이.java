class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int length = strlist.length;
        answer = new int[length];
        for(int i = 0; i < length; i ++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}