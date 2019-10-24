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
Status push(SqStack *S,ElemType e){
    if(S->top==S->stacksize)
    {
         S->base=(ElemType *)realloc(S->base,(S->stacksize+STACKINCREMENT)*sizeof(ElemType));
        if(!S->base)
        {
            exit(0);
        }
    }
    S->base[S->top++]=e;
    return OK;
}
Status pop(SqStack *S,ElemType *e){
    e=&S->base[S->top];
    S->top--;
    return OK;
}
Status matchBracket(SqStack *S,ElemType *str){
    InitStack(S);
    int i;
    char * e;
    for ( i = strlen(str)-1; i >= 0; i--)
    {
       if(str[i]==')'|| str[i]=='>' ||str[i]=='}' || str[i]==']')
       {
           push(S,str[i]);
       }else if(str[i]=='('|| str[i]=='<' ||str[i]=='[' || str[i]=='{')
       {
           if((str[i]=='('&&S->base[S->top-1]==')')||(str[i]=='<'&&S->base[S->top-1]=='>')||(str[i]=='['&&S->base[S->top-1]==']')||str[i]=='{'&&S->base[S->top-1]=='}')
           {
               pop(S,e);
           }else if(S->top!=0)
           {
               printf("匹配错误，有左括号没遇到与之对应的右括号！\n");
               return OK;
           }else
		   {
		   	   printf("左括号太多，匹配失败！\n");
		   	   return OK;
		   }   
       }
    }
    if(S->top==0)
    {
        printf("括号匹配成功！\n");
    }else if(S->base[S->top]=='<'||S->base[S->top]=='['||S->base[S->top]=='{'||S->base[S->top]=='(')
    {
        //printf("左括号太多，匹配失败！\n");
    }else
    {
        printf("右括号太多，匹配失败！\n");
    }
    return OK;
}
int main(void)
{
    SqStack s;
    ElemType e;
    char str[20];
    while(1)
    {
    	printf("请输入需要判断的字符串：\n");
	    scanf("%s",str);
	    matchBracket(&s,str);
    }


    return 0;

}