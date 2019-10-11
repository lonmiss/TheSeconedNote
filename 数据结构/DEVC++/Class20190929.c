#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
    
}Node,* LinkList;

void insert(LinkList h,int n)
{
    int i;
    LinkList s,tail = h;
    for(i=0;i<n;i++)
    {
        s=(LinkList)malloc(sizeof(Node));
        scanf("%d",&(s->data));
        s->next=NULL;
        
        tail->next=s;
        tail=s;
    }
}
void visit(LinkList h)
{
    h=h->next;
    while(h!=NULL)
    {
        printf("%3d",h->data);
        h=h->next;
    }
}
int len(LinkList h)
{
    int sum=0;
    h=h->next;
    while(h!=NULL)
    {
        h=h->next;
        sum++;
    }
    return sum;
}
int findIth(LinkList h,int n)
{
	int j=0;
	for(;j<n;)
	{
		j++;
		h=h->next;
	}
	return h->data;
}


int main(void)
{
    int length,e;
    LinkList head=(LinkList)malloc(sizeof(Node));
    head->next=NULL;
    insert(head,4);
    length=len(head);
    visit(head);
    e = findIth(head,2);
    printf("length:%d\n",length);
    printf("reverse ith is %d\n",e);
    return 0;
}
