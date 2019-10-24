#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define   Status    int
#define   OK        1
#define   ERROR     0
#define   m         5
#define   MAXQSIZE  10
typedef   int*     QElemType;
//单链队列
typedef struct QNode{
    QElemType data;
    struct QNode *next;
}QNode,*QueuePtr;

typedef struct{
    QueuePtr front;//对头指针
    QueuePtr rear;//对尾指针
}LinkQueue;

//初始化队列
Status InitQueue(QueuePtr d)
{
    d=(QueuePtr)malloc(sizeof(QNode));
    d->data=0;
    d->next=NULL;
    LinkQueue d1;
    d1.front=d;
    d1.rear=d;
    return OK;
}

int main(void)
{
    QueuePtr d;
    InitQueue(d);
}