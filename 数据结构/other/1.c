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


Status InitStack(SqStack *S)//初始化栈
{
	S->base = (ElemType *)malloc(STACK_INIT_SIZE*sizeof(ElemType));
	S->stacksize = STACK_INIT_SIZE;
    S->top=0;
	return OK;
}
Status push(SqStack *S,ElemType e)//入栈
{
	// SqStack * p;
	// p = (SqStack *)malloc(sizeof(SqStack));
	// *p->base  = e;
	// p->top = *p->base;
	// p->top ++;
	// printf("%d",S->top-1);
    if(S->top>S->stacksize)
    {
        S->base=(ElemType *)realloc(S->base,(S->stacksize+STACKINCREMENT)*sizeof(ElemType));
        if(!S->base)
        {
            exit(0);
        }
    }
    strcpy(S->base[S->top],e);
    S->top++;
	return OK;
}


Status pop(SqStack *S,ElemType *e)//出栈
{
	// if ( !S->top == *S->base)
	// {
	// 	*e = S->top-1;
	// 	S->top --;
	// }
    *e=S->base[S->top-1];
    S->top--;
	return OK;
}
Status matchBracket(SqStack *S,ElemType *str)//这个函数实现对str指向的字符串判断括号是否能匹配成功，可以调用栈的基本操作函数
{
	int i; 
	int flag = 0;
    char e;
	for(i=strlen(str)-1;i>=0;i--)
	{
		int cnt=0;
		printf("%c  \n",str[i]);
        if(str[i]=='<'||str[i]=='('||str[i]=='['||str[i]=='{'||str[i]=='>'||str[i]==')'||str[i]==']'||str[i]=='}')
        {
            switch (str[i])
            {
            	printf("cnt=%d\n",cnt++);
                case '>':push(S,str[i]);break;
                case ')':push(S,str[i]);break;
                case ']':push(S,str[i]);break;
                case '}':push(S,str[i]);break;
                default:continue;
            }
            if(str[i]=='<'&&S->base[S->top-1]=='>')
            {
                pop(S,&e);
            }else if(str[i]=='['&&S->base[S->top-1]==']')
            {
                pop(S,&e);
            }else if(str[i]=='('&&S->base[S->top-1]==')')
            {
                pop(S,&e);
            }else if(str[i]=='{'&&S->base[S->top-1]=='}')
            {
                pop(S,&e);
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
        return OK;
    }else
    {
        printf("右括号太多，匹配失败！\n"); 
        return OK;
    }
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