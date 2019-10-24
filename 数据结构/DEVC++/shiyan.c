#include <stdio.h>
#include <stdlib.h>

#define Status           int
#define OK              1
#define ERROR           0
#define STACK_INIT_SIZE 20
#define STACKINCREMENT  5
#define ElemType        int
#define OVERFLOW        -1
typedef struct {
    ElemType *base;
    ElemType *top;
    int stacksize;
}SqStack;
//InitStack�������£�
Status InitStack(SqStack *S)
{
    S->base = (ElemType *)malloc(STACK_INIT_SIZE * sizeof(ElemType));
    if (!S->base) exit(OVERFLOW);
    S->top = S->base;
    S->stacksize = STACK_INIT_SIZE;
    return OK;
}
//JudgRepetition�������£�
Status JudgRepetition(SqStack *S,ElemType e)
{
    // for(S->top = S->base;*S->top<(*S->top-*S->base);S->top++){
    //     if(*S->top==e)
    //         return ERROR;
    //     else
    //         return OK;
    // }

    //��ΪS->top ָ����� int ���ͣ������Ƽ�ʹ��whileѭ��

    // ������ĵ�ѭ��ֻ�ܽ���һ�Σ�����ȫ�����
    ElemType *q=S->top;
    while(q!=S->base)
    {
        if(*q==e)
        {
            return ERROR;
        }
        q--;
    }
    return OK;
}

//Push�������£�
Status Push(SqStack *S,ElemType e)
{
    if(S->top-S->base>=S->stacksize){
        S->base=(ElemType*)realloc(S->base,(S->stacksize+STACKINCREMENT)*sizeof(ElemType));
        if(!S->base) exit(OVERFLOW);
        S->top=S->base+S->stacksize;
        S->stacksize += STACKINCREMENT;
    }
    // if(S->top!=e){
    //     *((*S).top)++ = e;
    // }else{
    //     printf("%dΪ�ظ�Ԫ�ز��ɲ���",e);
    // }
    
    //��Ҫ����ǰ����д��һ���жϺ���~Ӧ�õ���ǰ��ĺ��������ж��Ƿ��ظ�����
    if(JudgRepetition(S,e))
    {
        *S->top=e;
        S->top++;
        S->stacksize++;
    }
    return OK;
}
//PrintStack�������£�
void PrintStack(SqStack S)
{
//    while(S.top>S.base)
//    {
//        S.top--;
//        printf("%d ",*S.top);
//    }
//    ����ǣ�5 3 22 11 
	while(S.base<S.top)
	{
		//����ֻ�Ƕ�ȡ���ݣ���ջ���κ�λ�ö����Զ�ȡ 
		printf("%d ",*S.base);
		S.base++;
	} 
	//11 22 3 5
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

