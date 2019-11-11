#include<stdio.h>
#include<stdlib.h>

#define OK 1
#define ERROR 0
#define Status int
#define STACK_INIT_SIZE 20
#define STACKINCREMENT 5
#define ElemType char

typedef struct {
    ElemType *base;
    int top;
    int stacksize;
}SqStack;

Status InitStack(SqStack *S)
{
    ElemType *newbase;
    newbase = (ElemType *)malloc(STACK_INIT_SIZE * sizeof(ElemType));
    if(!newbase) return ERROR;
    S->base=newbase;
    S->top = 0;
    S->stacksize = STACK_INIT_SIZE;
    return OK;
}

Status push(SqStack *S,ElemType e)
{
    if(S->top>=S->stacksize)
    {
        S->base = (ElemType*)realloc(S->base, (S->stacksize+STACKINCREMENT)*sizeof(ElemType));
        if(!S->base) return ERROR;
        S->stacksize += STACKINCREMENT;
    }
    S->base[S->top] = e;
    S->top++;
    return OK;
}

Status pop(SqStack *S,ElemType *e)
{
    if(S->top ==0 ) return ERROR;
    *e = S->base[--S->top];
    return OK;
}

Status matchBracket(SqStack *S,ElemType *str)
{
	char* u;

	switch (*str)
	{
		case'(':
            push("%s",str);
			if (u!=')')
			{
				if(S->top==0)
                {
                    pop("%s",str);
                    printf("左括号太多，匹配失败！\n");
                    return ERROR;
                }
                else
                {
                    printf("匹配错误，有左括号没遇到与之对应的右括号！\n");
                    return ERROR;
                }
			}

		case'[':
            push("%s",str);
			if (u != ']')
			{
				if(S->top==0)
                {
                    pop("%s",str);
                    printf("左括号太多，匹配失败！\n");
                    return ERROR;
                }
                else
                {
                    printf("匹配错误，有左括号没遇到与之对应的右括号！\n");
                    return ERROR;
                }
			}

		case'{':
            push("%s",str);
			if (u != '}')
			{
				if(S->top==0)
                {
                    pop("%s",str);
                    printf("左括号太多，匹配失败！\n");
                    return ERROR;
                }
                else
                {
                    printf("匹配错误，有左括号没遇到与之对应的右括号！\n");
                    return ERROR;
                }
			}

		default:
			break;
	}

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
