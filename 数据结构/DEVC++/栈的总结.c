
#include<stdio.h>
#include <stdlib.h>

#define STACK_INIT_SIZE 100 ; //�洢�ռ�ĳ�ʼ������ 

#define STACKINCREMENT 10; //�洢�ռ�ķ������� 
#define Status int;

typedef struct{
	int *base;//SElemType <==> int,Ϊ�˺�д����int����SElemType 
	int *top;
	int stacksize;
}SqStack;

//��ʼ��ջ
Status InitStack(SqStack* s)
{	//����һ����ջs 
	s->base=(int *)malloc(STACK_INIT_SIZE * sizeof(int));
	if(!s->base) exit(OVERFLOW);//�洢����ʧ��
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
		//��ʱջ��Ϊ�գ�ջ����׷�ӿռ�
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
	//��ջ���գ���ɾ��s��ջ��Ԫ�أ���e������ֵ��������OK�������򷵻�ERROR
	if(s->top==s->base)
	{
		return ERROR;
	} 
	e=*(--s->top);
	return OK;
}


// ջ��Ӧ��һ~~���Ƶ�ת��
void conversion()
{
	//�����������һ���Ǹ�ʮ���Ƶ���������ӡ��������ֵ�İ˽��Ƶ���
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
 
















