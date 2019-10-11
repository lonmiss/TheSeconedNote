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

void Init(LinkList *L)
{
	*L=(LinkList)malloc(sizeof(LNode));
	if(L==NULL)
	{
		exit(-1);
	} 
	(*L)->next=NULL;
}
void ListInsert(LinkList L){
    char str[8]={'s','o','f','t','w','a','r','e'};
    LinkList q;
    q=L;
    int i;
    for ( i = 0; i < strlen(str); i++)
    {
        LNode* Lnew=(LNode *)malloc(sizeof(LNode));
        Lnew->data=str[i];
        Lnew->next=NULL;
        q->next=Lnew;
        q=q->next;
        //printf("%c\n",Lnew->data);
    }
}
void OutPut(LinkList L)
{
    int cnt=0;
    LinkList q=L;
    for(;q;q=q->next)
    {
        cnt++;
    }
    printf("请输出倒数第三个数据：");
    int i=0;
    for(;q;q=q->next)
    {
        i++;
        if(i==cnt-3)
        {
            printf("%c\n",q->data);
        }
    }
    printf("请输出按顺序输出排好序之后的链表中的元素：\n");
    for(;q;q=q->next)
    {
        printf("%c\n",q->data);
    }
}

int main(void)
{
	LinkList L1;
	Init(&L1);
	ListInsert(L1);
	OutPut(L1);
	// Sort(L1);
	system("pause");
	return 0;
}

//https://www.cnblogs.com/rookiefly/p/3427694.html
