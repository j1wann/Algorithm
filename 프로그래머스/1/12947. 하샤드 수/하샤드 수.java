class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int limit = 10000;
        int param = x;
        int digitSum = 0;
        //1. 자릿수 합 구하기
        //1654
        while(param != 0)
        {
            int res = param / limit;
            digitSum += res;
            param -= limit  * res;
            limit /= 10;
        }        
        //2. 하샤드 수인지 검사
        if(x % digitSum != 0){
            answer = false;
        }
        return answer;
    }
}