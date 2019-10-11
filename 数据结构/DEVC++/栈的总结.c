
#include<stdio.h>
#include <stdlib.h>

#define STACK_INIT_SIZE 100 ; //存储空间的初始分配量 

#define STACKINCREMENT 10; //存储空间的分配增量 
#define Status int;

typedef struct{
	int *base;//SElemType <==> int,为了好写就用int代替SElemType 
	int *top;
	int stacksize;
}SqStack;

//初始化栈
Status InitStack(SqStack* s)
{	//构造一个空栈s 
	s->base=(int *)malloc(STACK_INIT_SIZE * sizeof(int));
	if(!s->base) exit(OVERFLOW);//存储分配失败
	s->top=s->base;
	s->stacksize=STACK_INIT_SIZE;
	return OK; 
} 
Status GetTop(SqStack s,int &e)
{
	if(s.top==s.base) 
	return ERROR;
	e=*(s.top-1);
	return OK;
}

Status Push(SqStack* s,int e)
{
	if(s->top-s->base>=s->stacksize)
	{
		//此时栈不为空，栈满，追加空间
		s->base=(int *)realloc(s.base,(s.stacksize+STACKINCREMENT)*sizeof(int));
		if(!s->base)
		{
			exit(OVERDLOW);
		} 
		s->top=s->base+s->stacksize;
		s->stacksize+=STACKINCREMENT;
	}
	*s->top=e;
	s->top++;
	return OK; 
}

Status Pop(SqStack* s,int &e)
{
	//若栈不空，则删除s的栈顶元素，用e返回其值，并返回OK；否则则返回ERROR
	if(s->top==s->base)
	{
		return ERROR;
	} 
	e=*(--s->top);
	return OK;
}


// 栈的应用一~~数制的转换
void conversion()
{
	//对输入的任意一个非负十进制的整数，打印输出与其等值的八进制的数
	SqStack s;
	InitStack(&s);
	int N;
	scanf("%d",N);
	while(N)
	{
		Push(&s,N%8);
		N/=8;
	} 
	while(!StackEmpty(s))
	{
		int e;
		pop(s,e);
		printf("%d",e);
	}
} 

int main(void)
{
	conversion();
	return 0;
}
 
















