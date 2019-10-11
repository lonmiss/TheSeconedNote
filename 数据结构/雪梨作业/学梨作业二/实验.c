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
	*L=(LinkList)malloc(sizeof(LNode));
	if(L==NULL)
	{
		exit(-1);
		return ERROR;
	} 
	(*L)->next=NULL;
	return OK; 
}
Status ListInsert(LinkList L){
    char str[8]={'s','o','f','t','w','a','r','e'};
    LinkList q;
    q=L;
    int i;
    for ( i = 0; i<8; i++)
    {
        LNode* Lnew=(LNode *)malloc(sizeof(LNode));
        Lnew->data=str[i];
        Lnew->next=NULL;
        q->next=Lnew;
        q=q->next;
        //printf("%c\n",Lnew->data);
    }
    return OK;
}
void OutPut(LinkList L)
{
    int cnt=0;
    LinkList q=L;
    LinkList q1=L;
    for(;q;q=q->next)
    {
        cnt++;
    }
    printf("请输出倒数第三个字符：");
    int i=0;
    for(;q1;q1=q1->next)
    {
        if(i==cnt-3)
        {
            printf("%c\n",q1->data);
        }
        i++;
    }
   
}
void Sort(LinkList L)
{
	LinkList cur,tail;
	cur=L->next;
	tail=NULL;
	while(cur!=tail)
	{
		while(cur->next!=tail)
		{
			if(cur->data> cur->next->data)
			{
				char temp=cur->data;
				cur->data=cur->next->data;
				cur->next->data=temp;
			}
			cur=cur->next;
		}
		tail=cur;
		cur=L->next;
	}
	LinkList q2=L;
	printf("请按顺序输出输出排好序之后的链表中的元素值：\n");
    for(q2=q2->next;q2;q2=q2->next)
    {
        printf("%c\n",q2->data);
    }
}
int main(void)
{
	LinkList L1;
	Init(&L1);
	ListInsert(L1);
	OutPut(L1);
	Sort(L1);
	return 0;
}

//https://www.cnblogs.com/rookiefly/p/3427694.html

