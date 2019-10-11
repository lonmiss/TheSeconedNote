#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
	int data;
	struct Node * next;
}Node;

/*1、在O（1）时间删除链表节点 
	给定链表的头指针和一个节点指针，
	在O（1） 时间删除该节点~assert的作用是现计算表达式 expression ，如果其值为假（即为0），
	那么它先向stderr打印一条出错信息，然后通过调用 abort 来终止程序运行 
*/

//void DeletRandomNode(Node *cur)
//{
//	assert(cur!=NULL);
//	assert(cur->next!=NULL);
//	Node* pNext=cur->next;
//	cur->data=pNext->data;
//	cur->next=pNext->next;
//} 

/*
单链表的转置：输入一个单向链表，输出逆序反转后的链表
	链表的转置是一个很常见、很基础的数据结构题了，非递归的算法很简单，用
	三个临时指针pre、head、next在链表上循环一遍即可 
*/
Node* reverseByLoop(Node *head)
{
	if(head==NULL||head->next==NULL)
	{
		return head;
	}
	Node *pre=NULL;
	Node *next=NULL;
	while(head!=NULL)
	{
		next=head->next;
		
		head->next=pre;
		pre=head;
		head=next;
	}
	return pre;
} 

// 打印链表
void printList(Node * head)
{
	for(;head!=NULL;head=head->next)
	{
		printf("%d ",head->data);
	}
	printf("\n");
} 
// 链表长度
int sizeList(Node * head)
{
	int n;
	for(n=0;head!=NULL;head=head->next)
	{
		n++;
	}
	return n;
} 
// 背后插入数据
void pushBackList(Node ** pList,int data)
{
	Node * newNode=(Node *)malloc(sizeof(Node));
	newNode->data=data;
	newNode->next=NULL;
	if(*pList==NULL)
	{
		*pList=newNode;//判断链表是否为空 
	}else
	{
		Node *head=*pList;
		while(head->next!=NULL)
		{
			head=head->next;
		} 
		head->next=newNode;
	} 
} 
int main(void)
{
	Node * list = NULL;
	pushBackList(&list, 1);
	pushBackList(&list, 2);
	pushBackList(&list, 3);
	pushBackList(&list, 4);
	pushBackList(&list, 5);
	printList(list);
	printf("len=%d\n",sizeList(list));
	/*
		1 2 3 4 5
		len=5
		
		--------------------------------
		Process exited after 0.3196 seconds with return value 0
		请按任意键继续. . .

	*/
	return 0;
} 
