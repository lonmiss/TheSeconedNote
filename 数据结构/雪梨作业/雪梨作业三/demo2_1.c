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
    printf("~~~~~~~");
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
// void PrintStack(SqStack S)
// {
//     while(S.top>=0)
//     {
//         printf("%d ",S.base[S.top]);
//         S.top--;
//     }
// }
Status matchBracket(SqStack *S,ElemType *str)
{
    SqStack * q=S;
    InitStack(q);
    int i;
    //printf("strlen(str)=%d \n",strlen(str));
    int cnt=0;
    for(i=0;i<strlen(str);i++)
    {
        //Push(S,str[i]);
        if(str[i]=='<' || str[i]=='>' || str[i]=='(' || str[i]==')' || str[i]=='[' || str[i]==']' || str[i]=='{' || str[i]=='}')
        {
		    Push(S,str[i]);
    	}
    }
    for(i=S->top;i>=0;i--)
    {
        if(str[i]=='>'||str[i]==')'||str[i]==']'||str[i]=='}')
        {
            
        }
    }	
        printf("S->top=%d\n",S->top);
        if(S->top==0)
        {
            printf("括号匹配成功！");
        }else if(S->base[S->top]=='<'||S->base[S->top]=='['||S->base[S->top]=='{'||S->base[S->top]=='(')
        {
            printf("左括号太多，匹配失败！\n");
        }else{
            printf("左括号太多，匹配失败！\n");
        }
    }    
   
    //PrintStack(*S);

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