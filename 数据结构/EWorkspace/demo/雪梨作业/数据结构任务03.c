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
	L=malloc(sizeof(LNode));
	if(L==NULL)
	{
		printf("未成功分配内存");
	}
	strcpy(L->data,"1");
	L->next=NULL;
	return L;
}
Status ListInsert(LinkList L)
{
	char words[8];
	scanf("%s",words);
	int i;
	LNode* header=(LNode *)malloc(sizeof(LNode));
	header=L;
	for(i=0;words[i]!='\0';i++)
	{
		LNode* NewL=(LNode *)malloc(sizeof(LNode));
		strcpy(NewL->data,words[i]);
		NewL->next=NULL;
		header->next=NewL;
		header=header->next;
	}
	return L;
}
void Sort(LinkList L)
{
	LNode *p,*q;
	char cnt;
	for (p=L->next;p!=NULL;p=p->next)
	{
		for(q=p->next;q!=NULL;q=q->next)
		{
			if(q->data>q->next->data)
			{
				strcpy(cnt,q->data);
				strcpy(q->data,q->next->data);
				strcpy(q->next->data,cnt);
			}
		}
	}
}
void OutPut(LinkList L)
{
	LNode *p=L;
    for(p;p!=NULL;p=p->next) {
		printf("%c",p->data);
	}
}
int main(void)
{
	LinkList L1;
	Init(&L1);
	ListInsert(L1);
	OutPut(L1);
	Sort(L1);
	system("pause");
	return 0;
}
