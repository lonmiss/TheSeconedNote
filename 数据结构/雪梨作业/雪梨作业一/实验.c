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
    LNode* header=(LNode *)malloc(sizeof(LNode));
    header->next=NULL;
    L=header;
    return L; 
}
Status ListInsert(LinkList L){
    char str[8]={'s','o','f','t','w','a','r','e'};
    LNode *q;
    q=L->next;
    int i;
    for ( i = 0; i < strlen(str); i++)
    {
        LNode* Lnew=(LNode *)malloc(sizeof(LNode));
        Lnew->data=str[i];
        Lnew->next=NULL;
        q=Lnew;
        q=Lnew->next;
    }
    return L;   
}
void Myprint(LinkList L)
{
    LNode *q=L;
    for (;q!=NULL;q=q->next)
    {
        printf("%c\n",q->data);
    }
    
}
int main(void)
{
	LinkList L1;
	Init(&L1);
	ListInsert(L1);
    Myprint(L1);
	// OutPut(L1);
	// Sort(L1);
	system("pause");
	return 0;
}
