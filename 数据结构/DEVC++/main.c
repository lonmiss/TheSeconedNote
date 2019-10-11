#include <stdio.h>
#define LIST_INITSIZE 100
#define ElemType int
#define Status int
#define OK     1
#define ERROR  0

typedef struct
{
       ElemType elem[LIST_INITSIZE];
       int length;
}SqList;
void InitList_Sq(SqList *l){
	//l=malloc(sizeof(Sqlist));
	l->length=0;
}
void ListInsert(SqList *l,int i,int data){
	l->elem[i-1]=data;
	l->length++;
}
void ListPrint(SqList l)
{
	int i;
	for(i=0;i<l.length;i++)
	{
		printf("%d ",l.elem[i]);
	}
	printf("\n");
}
void DeleteElem(SqList *l)
{
	int Sums[l->length];
	int cnt=0;//筛选锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷 
	int a=l->elem[3-1];
	int b=l->elem[6-1];
	int i=0;
	for(i=0;i<l->length;i++)
	{
		if((l->elem[i]>a)&&(l->elem[i]<b))
		{
			continue;
		}
		else{
			Sums[cnt++]=l->elem[i];
		} 
	}
	l->length=cnt;
	for(i=0;i<cnt;i++)
	{
		l->elem[i]=Sums[i];
	}
}
int main(void)
{
	SqList L;
	int i = 0;
	ElemType e;
	ElemType data[9] = {10,263,-32,-3,-25,88,77,0,-9};
	InitList_Sq(&L);
	for(i = 1;i <= 9;i++)
	ListInsert(&L,i,data[i-1]);
	
	printf("锟斤拷锟斤拷锟斤拷珊锟絃 = : ");
	ListPrint(L);
	DeleteElem(&L);
	printf("删锟斤拷锟饺碉拷锟斤拷锟斤拷元锟截达拷锟斤拷冶鹊锟斤拷锟斤拷锟皆拷锟叫★拷锟斤拷锟斤拷锟皆拷兀锟� ");
	ListPrint(L);
	system("pause");
	return 0;
}
