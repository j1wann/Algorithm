class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int h1 : array){
            if (h1 > height)
                answer++;
        }
        
        return answer;
    }
}