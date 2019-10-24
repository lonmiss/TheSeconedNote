//链表实现栈
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

void init(Q *q)
{
    q->f=q->r=(Node *)malloc(sizeof(Node));
    q->f->next=NULL;
}

void push(Q *q,int a)
{
    Node *p=(Node *)malloc(sizeof(Node));
    p->data=a;
    p->next=NULL;
    q->r->next=p;
    q->r=p;
}

void pop(Q *q,int *t)
{
    *t=q->r->data;
    Node *z=q->f;
    while(z->next->next!=NULL)
    {
        z=z->next;
    }
    q->r=z;
    q->r->next=NULL;
}

void myPrint(Q q)
{
    Node *z=q.f->next;
    while(z)
    {
        printf("%3d",z->data);
        z=z->next;
    }
    printf("\n");
}
int main(int argc, char const *argv[])
{
    Q myZ;
    int t;
    init(&myZ);
    myPrint(myZ);
    push(&myZ,1);
    pop(&myZ,&t);
    myPrint(myZ);
//    push(&myZ,2);
//    push(&myZ,3);
//    push(&myZ,4);
//    push(&myZ,5);
//    myPrint(myZ);
//    pop(&myZ,&t);
//    myPrint(myZ);
//    printf("t=%d\n",t);
//    pop(&myZ,&t);
//    myPrint(myZ);
//    printf("t=%d",t);
    return 0;
}

