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
//InitStack函数如下：
Status InitStack(SqStack *S)
{
    S->base = (ElemType *)malloc(STACK_INIT_SIZE * sizeof(ElemType));
    if (!S->base) exit(OVERFLOW);
    S->top = S->base;
    S->stacksize = STACK_INIT_SIZE;
    return OK;
}
//JudgRepetition函数如下：
Status JudgRepetition(SqStack *S,ElemType e)
{
    // for(S->top = S->base;*S->top<(*S->top-*S->base);S->top++){
    //     if(*S->top==e)
    //         return ERROR;
    //     else
    //         return OK;
    // }

    //因为S->top 指向的是 int 类型；还有推荐使用while循环

    // 你里面的的循环只能进行一次，不能全部检测
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

//Push函数如下：
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
    //     printf("%d为重复元素不可插入",e);
    // }
    
    //不要忘记前面你写了一个判断函数~应该调用前面的函数，来判断是否重复插入
    if(JudgRepetition(S,e))
    {
        *S->top=e;
        S->top++;
        S->stacksize++;
    }
    return OK;
}
//PrintStack函数如下：
void PrintStack(SqStack S)
{
//    while(S.top>S.base)
//    {
//        S.top--;
//        printf("%d ",*S.top);
//    }
//    结果是：5 3 22 11 
	while(S.base<S.top)
	{
		//这里只是读取数据，从栈的任何位置都可以读取 
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

