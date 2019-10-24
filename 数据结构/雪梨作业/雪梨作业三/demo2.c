#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define OK              1
#define ERROR           0
#define Status          int
#define STACK_INIT_SIZE 20
#define STACKINCREMENT  5
#define ElemType        char

typedef struct {
    ElemType *base;
    int top;
    int stacksize;
}SqStack;

Status InitStack(SqStack *S){
    S->base=(ElemType *)malloc(sizeof(ElemType)*STACK_INIT_SIZE);
    if(!S->base)
    {
        exit(0);
    }
    S->top=0;
    S->stacksize=STACK_INIT_SIZE;
    return OK;
}
void Push(SqStack *S,char a)
{
    if(S->top<S->stacksize)
    {
        S->base=(ElemType *)realloc(S->base,(S->stacksize+STACKINCREMENT)*sizeof(ElemType));
        if(!S->base)
        {
            exit(0);
        }
    }
    S->base[S->top]=a;
    S->top++;
}

Status pop(SqStack *S,ElemType *e){
    *e=S->base[S->top];
    S->top--;
    return OK;
}

Status matchBracket(SqStack *S,ElemType *str)
{
    InitStack(S);
    int i;
    for (int i = strlen(str); i >=0; i--)
    {
        printf("%c \n",str[i]);
        if(str[i]=='<' || str[i]=='>' || str[i]=='(' || str[i]==')' || str[i]=='[' || str[i]==']' || str[i]=='{' || str[i]=='}')
        {
            if(str[i]=='>'||str[i]==')'||str[i]==']'||str[i]=='}')
            {
                Push(S,str[i]);
            }else
            {
                if(((str[S->top-1]=='>')&&(str[i]=='<'))||((str[S->top-1]==']')&&(str[i]=='['))||((str[S->top-1]=='}')&&(str[i]=='{'))||((str[S->top-1]==')')&&(str[i]=='(')))
                {
                    Pop(S,str[S->top-1]);
                }else
                {
                    printf("匹配错误，有左括号没遇到与之对应的右括号！");
                }
            }
        }
    }
    printf("66");

    return OK;
}
int main(void)
{
    SqStack s;
    ElemType e;
    char str[20];
    printf("请输入需要判断的字符串：");
    scanf("%s",str);
    matchBracket(&s,str);
    return 0;

}