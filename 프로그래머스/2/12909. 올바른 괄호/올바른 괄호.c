#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
void push(char s);
bool pop();
bool isEmpty();
char* init(int size);
char* stack;
int top = -1;

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
/*
    s의 size만큼 반복
    문자 s를 복사하여 검사
    1. 여는괄호일 때 (
    push 실행
    2. 닫는괄호일 때 )
    pop 실행
    
    true와 false의 판별
    1. 끝까지 반복했음에도 stack이 empty가 아닌 경우
    2. 스택이 비었음에도 닫는괄호를 만나 pop이 실행되는 경우
*/
bool solution(const char* s) {
    char element;
    bool answer = true;
    int arrSize = strlen(s);
    stack = init(arrSize);
    
    for(int i = 0; i < arrSize; i++){
        element = s[i];
        if(element == '('){
            push(element);
        }
        else{
            bool popChk = pop();
            if(!popChk){
                answer = false;
                break;
            }
        }
    }
    
    if(!isEmpty()){
        answer = false;
    }
    free(stack);
    return answer;
}

char* init(int size){
    char* stack = (char*)malloc(size);
    return stack;
}

bool isEmpty(){
    if(top == -1){
        return true;
    }
    else{
        return false;
    }
}

void push(char s){
    ++top;
    stack[top] = s;
}

bool pop(){
    if(isEmpty()){
        return false;
    }
    else{
        top--;
        return true;
    }
}
