//链表实现队列
#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
}Node;

typedef struct Q{
    Node *f,*r;
}Q;

//初始化
void init(Q *q)
{
    q->f=q->r=(Node *)malloc(sizeof(Node));
    q->f->next=NULL;

}

//入队
void enQueue(Q *q,int x)
{
    Node *p=(Node *)malloc(sizeof(Node));
    p->next=NULL;
    p->data=x;
    q->r->next=p;
    q->r=p;
}

//出对
void delqueue(Q *q,int *x)
{
    if(q->f!=q->r)
    {
        Node *p=q->f->next;
        *x=p->data;
        q->f->next=p;
        free(p);
    }
}

//遍历
void travel(Q q)
{
    Node *p;
    for(p=q.f->next;p!=NULL;p=p->next)
    {
        printf("%3d",p->data);
    }
}

int main(int argc, char const *argv[])
{
    Q myq;
    int t;
    init(&myq);
    enQueue(&myq,11);
    enQueue(&myq,12);
    enQueue(&myq,13);
    enQueue(&myq,14);
    enQueue(&myq,15);
    travel(myq);
    delqueue(&myq,&t);
    travel(myq);
    printf("\n deleted the element is %d",t);
    return 0;
}
