#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
	int data;
	struct Node * next;
}Node;

/*1����O��1��ʱ��ɾ������ڵ� 
	���������ͷָ���һ���ڵ�ָ�룬
	��O��1�� ʱ��ɾ���ýڵ�~assert���������ּ�����ʽ expression �������ֵΪ�٣���Ϊ0����
	��ô������stderr��ӡһ��������Ϣ��Ȼ��ͨ������ abort ����ֹ�������� 
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
�������ת�ã�����һ�����������������ת�������
	�����ת����һ���ܳ������ܻ��������ݽṹ���ˣ��ǵݹ���㷨�ܼ򵥣���
	������ʱָ��pre��head��next��������ѭ��һ�鼴�� 
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

// ��ӡ����
void printList(Node * head)
{
	for(;head!=NULL;head=head->next)
	{
		printf("%d ",head->data);
	}
	printf("\n");
} 
// ������
int sizeList(Node * head)
{
	int n;
	for(n=0;head!=NULL;head=head->next)
	{
		n++;
	}
	return n;
} 
// �����������
void pushBackList(Node ** pList,int data)
{
	Node * newNode=(Node *)malloc(sizeof(Node));
	newNode->data=data;
	newNode->next=NULL;
	if(*pList==NULL)
	{
		*pList=newNode;//�ж������Ƿ�Ϊ�� 
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
		�밴���������. . .

	*/
	return 0;
} 
