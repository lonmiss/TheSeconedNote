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
void ListPrint(SqList L)
{
	int i;
	for(i=0;i<L.length;i++)
	{
		printf("%d ",L.elem[i]);
	}
	printf("\n");
}
void DeleteElem(SqList *L)
{
	int Sums[L->length];
	int cnt=0;
	int a=L->elem[3-1];
	int b=L->elem[6-1];
	int i=0;
	for(i=0;i<L->length;i++)
	{
		if((L->elem[i]>a)&&(L->elem[i]<b))
		{
			continue;
		}
		else{
			Sums[cnt++]=L->elem[i];
		} 
	}
	L->length=cnt;
	for(i=0;i<cnt;i++)
	{
		L->elem[i]=Sums[i];
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

   printf("插入完成后L = : ");
   ListPrint(L);
   DeleteElem(&L);
   printf("删除比第三个元素大的且比第六个元素小的数据元素： ");
   ListPrint(L);
   system("pause");
   return 0;
}
