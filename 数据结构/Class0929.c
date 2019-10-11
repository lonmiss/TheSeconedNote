#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
    
}Node,*LinkList;

void Create(LinkList h,int n)
{
    LinkList q;
    int i;
    q=h;
    for (i = 0; i < n; i++)
    {
        Node* Lnew=(Node *)malloc(sizeof(Node));
        scanf("%d",&(Lnew->data));
        Lnew->next=NULL;
        q->next=Lnew;
        q=q->next;
    }
    
}
void visit(LinkList h)
{
    LinkList q=h;
    for(;q;q=q->next)
    {
        printf("%d ",q->data);
    }
    printf("\n");
}
/*int len(LinkList h)
{
    int cnt=0;
    LinkList q=h->next;
    for ( cnt = 0; q; cnt++,q=q->next);
    return cnt;
}*/
// int FindTth(LinkList h,int i)
// {
    
// }
int main(void)
{
    int length,e;
    LinkList head=(LinkList)malloc(sizeof(Node));
    head->next=NULL;
    Create(head,4);
    length=len(head);
    visit(head);
    //e = FindTth(head,2);
    printf("length:%d\n",length);
    printf("reverse ith is %d\n",e);
    return 0;
}

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
void visit1(LinkList h)
{
    h=h->next;
    while(h!=NULL)
    {
        printf("%3d",h->data);
    }
}
void len1(LinkList h)
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
int findIth1(LinkList h,int i)
{
    int lengofh=len(h);
    int j=0;
    h=h->next;
    while(i<lengofh-i+1)
    {
        j++;
        h=h->next;
    }
    return h->data;
}