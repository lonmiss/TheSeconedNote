/*
    2_1 静态顺序存储线性表的基本实现

任务描述：

        根据给出的存储结构，完成现在下列函数功能，并按照主函数的代码，输出规定的效果。

预定义常量和类型：

#define LIST_INITSIZE 100
#define ElemType int
#define Status int
#define OK     1
#define ERROR  0

存储结构：

typedef struct
{

       ElemType elem[LIST_INITSIZE];

       int length;

}SqList;

函数操作：

输出打印：void ListPrint(SqList L);

删除：void DeleteElem(SqList *L);

注意：

          输出打印是指将表中数据元素打印出来；

          删除操作是删除比第三个元素大的且比第六个元素小的数据元素,并保证元素的相对位置不变。

主函数如下：

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
*/
#include <stdio.h>
#include <stdlib.h>

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

Status InitList_Sq(SqList *L)
{
	L->length = 0;
	return OK;
}

Status ListInsert(SqList *L, int i,ElemType e)
{
	int k;
	if(i < 1 || i > L->length+1)
	{
		printf("i值不合法！\n");
		return ERROR;
	}
	if(L->length >= LIST_INITSIZE)
	{
		printf("元素已满，不能插入！\n");
		return ERROR;
	}
	for(k = L->length-1; k >= i-1; --k)
		L->elem[k+1] = L->elem[k];
	
	L->elem[i-1] = e;
	++L->length;
	return OK;
}

Status ListDelete(SqList *L,int i,ElemType *e)
{
	ElemType *p, *q;
	int k = 0;
	if(i < 1 || i > L->length)
	{
		printf("删除位置有误!\n");
		return ERROR;
	}
	*e = L->elem[i-1];
	for(k = i-1; k < L->length-1; ++k)
	{
		L->elem[k] = L->elem[k+1];
	}

	--L->length;
	return OK;
}

Status GetElem(SqList L, int i ,ElemType *e)
{
	if(i < 1 || i > L.length)
	{
		printf("获取元素位置有误!\n");
		return ERROR;
	}
	*e = L.elem[i-1];
	return OK;
}

void DeleteElem(SqList *L)
{
	ElemType third, six, e;
    int i=0,k=0;
	third=L->elem[2];
	six=L->elem[5];
	for(i = 1;i <= L->length; i++)
	{
		e=L->elem[i-1];
		if(e > third && e < six)
		{
			for(k = i-1; k < L->length-1; ++k)
			{
				L->elem[k] = L->elem[k+1];
			}
			--L->length;
			i--;
		}

	}
}

void ListPrint(SqList L)
{
	int i;
	ElemType e;
	for(i = 1; i <= L.length; ++i)
	{
		e=L.elem[i-1];
		printf("%d ",e);
	}
	printf("\n");

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