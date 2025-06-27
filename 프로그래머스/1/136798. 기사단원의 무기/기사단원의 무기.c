#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int get_measure_cnt(int number);
int get_weight(int mArr[], int arrSize);
int get_sqrt(int number);
int solution(int number, int limit, int power) {
    int answer = 0;
    int measureArr[number];
    
    for(int i = 1; i <= number; i++){
        int measure = get_measure_cnt(i);
        if(measure > limit){
            measureArr[i - 1] = power;
            continue;
        }
        measureArr[i - 1] = measure;
    }
    answer = get_weight(measureArr, number);
    
    return answer;
}

//number의 약수를 구하는 함수
/*
제곱근과 가장 가까운 수를 구함 > R라고 지칭
1) R^2 == number인 경우
    - 1 ~ R-1까지 나머지가 0인 수 * 2 + 1
2) R^2 > number인 경우
    - 1 ~ R 까지의 나머지가 0인 수 * 2
*/
int get_measure_cnt(int number){
    int result = 0;
    int sqrt = get_sqrt(number);
    
    for(int i = 1; i <= sqrt; i++){
        if(number % i == 0){
            result++;
        }
    }
    
    
    if(sqrt*sqrt == number){
        result = result*2 - 1;
    }
    else{
        result = result*2;
    }
    
    return result;   
}

int get_weight(int mArr[], int arrSize){
    int result = 0;
    
    for(int i = 0; i < arrSize; i++){
        result += mArr[i];
    }
    
    return result;
}
int get_sqrt(int number){
    int sqrt = 0;
    for(int i = 1; i <= number; i++){
        if(i*i == number){
            sqrt = i;                
            break;
        }
        else if(i*i > number){
            sqrt = i-1;
            break;
        }
    }
    return sqrt;
}
