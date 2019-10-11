#include <stdio.h>
#include <stdlib.h>
#include<string.h>

#define OK 1
#define ERROR 0

typedef int Status;
typedef char ElemType;

typedef struct Node
{
	ElemType data;
	struct Node * next;	
}LNode,*LinkList;

Status Init(LinkList *L)
{
	LNode *newNode=(LNode *)malloc(sizeof(LNode));
	newNode->next=NULL;
	L=newNode;
	return L; 
} 
void ListInsert(LinkList L)
{
	char str[]={'s','o','f','t','w','a','r','e'};
	
	//L->next=newNode;
	LNode* tail=L;
	int i;
	for(i=0;str[i]!=NULL;i++)
	{
		LNode *Lnew=(LNode *)malloc(sizeof(LNode));
		Lnew->data=str[i];
		Lnew->next=NULL;
		tail->next=Lnew;
		tail=Lnew;
	}
}
void Sort(LinkList L)
{
	LNode *q,*p,*c;
	p=L->next;
	q=L;
	char cnt;
	while(p!=NULL)
	{
		while(p->next!=NULL)
		{
			if(p->data > p->next->data)
			{
				cnt=p->data;
				p->data=p->next->data;
				p->next->data=cnt;
			}
			p=p->next;
		}
		p=q->next;
		q=p;
	}
	for(c=L->next;c;c=c->next)
	{
		printf("%c\n",c->data);
	}
}

int main(void)
{
	LinkList L1;
	Init(&L1);
	ListInsert(L1);
	//OutPut(L1);
	Sort(L1);
	//system("pause");
	return 0;
}
