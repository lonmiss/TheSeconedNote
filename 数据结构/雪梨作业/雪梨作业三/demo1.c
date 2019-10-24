#include<stdio.h>
#include<stdlib.h> 
#define Status           int
#define OK              1
#define ERROR           0
#define STACK_INIT_SIZE 20
#define STACKINCREMENT  5
#define ElemType        int

typedef struct {
    ElemType *base;
    ElemType *top;
    int stacksize;
}SqStack;

Status InitStack(SqStack *S){
    S->base=(ElemType *)malloc(sizeof(ElemType)*STACK_INIT_SIZE);
    if(!S->base)
    {
        exit(0);
    }
    S->top=S->base;
    S->stacksize=STACK_INIT_SIZE;
    return OK;
}
 Status JudgRepetition(SqStack *S,ElemType e){
    int flag=0;
	ElemType *head=S->top;
    while(S->top!=S->base)
    {
        if(*S->top==e)
        {
            flag=1;
            break;
        }
        S->top--;
    }
    S->top=head;
    if(flag==1)
    {
        return 1;
    }else
    {
        return 2;
    }
    
 }
Status Push(SqStack *S,ElemType e){
    if(JudgRepetition(S,e)==1){
        printf("%d为重复元素不可插入!\n",e);
        return OK;
    }else
    {
        if(S->top - S->base >=S->stacksize)
        {
            S->base=(int *)realloc(S->base,(S->stacksize+STACKINCREMENT)*sizeof(ElemType));
            if(!S->base)
            {
                exit(0);
            }
        }
        *S->top=e;
        S->top++;
        return OK;
    }
    
}
void PrintStack(SqStack S)
{
    while(S.top!=S.base)
    {
        printf("%d ",*S.base);
        S.base++;
    }
}
int main(void)
{
   SqStack s;
   ElemType *p = NULL;
   InitStack(&s);

   Push(&s,11);
   Push(&s,22);
   Push(&s,3);
   Push(&s,22);
   Push(&s,5);
   Push(&s,5);
   PrintStack(s);

   return 0;

}