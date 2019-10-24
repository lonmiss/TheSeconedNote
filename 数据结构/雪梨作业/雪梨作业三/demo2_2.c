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
    *e=S->base[S->top-1];
    S->top--;
    return OK;
}

Status matchBracket(SqStack *S,ElemType *str){
    int i;
    char *a;
    for ( i = 0; i < strlen(str); i++)
    {
         if(str[i]=='<' || str[i]=='>' || str[i]=='(' || str[i]==')' || str[i]=='[' || str[i]==']' || str[i]=='{' || str[i]=='}')
        {
            if(str[i]=='>'||str[i]==')'||str[i]==']'||str[i]=='}')
            {
                Push(S,str[i]);
            }else
            {
                if(((str[S->top-1]=='>')&&(str[i]=='<'))||((str[S->top-1]==']')&&(str[i]=='['))||((str[S->top-1]=='}')&&(str[i]=='{'))||((str[S->top-1]==')')&&(str[i]=='(')))
                {
                    pop(S,a);
                }else
                {
                	printf("%c %c",str[S->top-1],str[i]);
                    printf("匹配错误，有左括号没遇到与之对应的右括号！\n");
                    return 0;
                }
            }
        }
    }
    if(S->top==0)
    {
        printf("括号匹配成功！\n");
    }else if (S->base[S->top-1]=='>'||S->base[S->top-1]==')'||S->base[S->top-1]==']'||S->base[S->top-1]=='}')
    {
        printf("右括号太多，匹配失败！\n");
    }else
    {
        printf("左括号太多，匹配失败！\n");
    }
    return OK;
    
}
int main(void) {
    SqStack s;
    ElemType e;
    char str[20];
    printf("请输入需要判断的字符串：");
    scanf("%s",str);
    matchBracket(&s,str);
    return 0;
}