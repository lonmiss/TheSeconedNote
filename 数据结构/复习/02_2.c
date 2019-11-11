/*
2_2 动态顺序存储线性表的基本实现

任务描述：

根据给出的存储结构，完成现在下列函数功能，并按照主函数的代码，输出规定的效果。

预定义常量和类型：

#define LIST_INIT_SIZE 100
#define LISTINCREMENT 10
#define Status int
#define OVERFLOW -1
#define OK 1
#define ERROR 0
#define ElemType int

存储结构：

typedef struct
{
       ElemType * elem;
       int length;
       int listsize;
}SqList;

函数操作：

打印：void ListPrint_Sq(SqList L)

分类：void PartList(SqList *La)

注意：

       输出打印(ListPrint_Sq)是指将表中数据元素打印出来；

       分类(PartList)是在线性表L中将正数和负数分开，正数在前，负数在后，0在中间，正数的相对位置保持不变，负数的相对位置也保持不变。

主函数如下：

int main(void)
{
    SqList L;
    int i=0;
    ElemType e;
    ElemType data[9] = {10,263,-32,-3,-25,88,77,0,-9};
    InitList_Sq(&L);
    for(i = 0;i < 9; i++)
       ListInsert_Sq(&L,i+1,data[i]);

    printf("插入完成后 L = : ");
    ListPrint_Sq(L);
    PartList(&L);
    printf("元素分类后的线性表：");
    ListPrint_Sq(L);
    system("pause");
    return 0;
}
*/
#include <stdio.h>
#include <stdlib.h>

#define LIST_INIT_SIZE 100
#define LISTINCREMENT 10
#define Status int
#define OVERFLOW -1
#define OK 1
#define ERROR 0
#define ElemType int
typedef struct
{
	ElemType * elem;
	int length;
	int listsize;
}SqList;

Status InitList_Sq(SqList *L)
{
	L->elem = (ElemType *)malloc((LIST_INIT_SIZE)*sizeof(ElemType));
    //L->elem=(ElemType *)realloc((L->elem),LIST_INIT_SIZE*2*sizeof(ElemType));
	if(! L->elem) exit(OVERFLOW);        
	L->length = 0;                 
	L->listsize = LIST_INIT_SIZE;  
	return OK;
}

Status ListInsert_Sq(SqList *L,int i,ElemType e)
{
	ElemType *q,*p,*newbase;
	if(i < 1 || i > L->length +1 ) return 0;     
	if(L->length >= L->listsize ){              
		newbase = (ElemType *)realloc(L->elem,(L->listsize + LISTINCREMENT)*sizeof(ElemType));
		if(! newbase) exit(OVERFLOW);					 
		L->elem = newbase;						 
		L->listsize += LISTINCREMENT;			
	} 
	q = &(L->elem[i - 1]);			         	
	for(p = &(L->elem[L->length-1]);p >= q; --p)
		*(p+1) = *p;							
	*q = e;										 
	L->length++;
	return OK;
}
Status ListDelete_Sq(SqList *L,int i,ElemType *e)
{
	ElemType *p,*q;
	if ((i < 1) || (i > L->length))	
		return ERROR;								 
	p = &(L->elem[i-1]);						
	*e = *p;									 
	q = L->elem + L->length-1;					
	for (++p;p<=q;++p)
		*(p-1) = *p;							 
	L->length--;
	return OK;
}

void ListPrint_Sq(SqList L)
{
	int i = 0;
	for(i = 0;i < L.length; i++)
	{
		printf("  %d",L.elem[i]);
	}
	printf("  \n");
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

void PartList(SqList *La)
{
    int i, j, k = 0;
    ElemType e, *p, *q;
    for(i = 1, j = 1; j <= La->length; ++i, ++j)
    {
        e = La->elem[i-1];
        if(e < 0)
        {
           	p = &(La->elem[i-1]);						
	        q = La->elem + La->length-1;					
	        for (++p; p <= q; ++p)
		        *(p-1) = *p;	
            La->elem[La->length-1] = e;
            --i;
        }
    }
    for(i = 1; i <= La->length; ++i)
        if(La->elem[i-1] >= 0)
            ++k;
    

    for(i = 1, j = 1; j <= k; ++i, ++j)
    {
        e = La->elem[i-1];
        if(e == 0)
        {
           	p = &(La->elem[i-1]);						
	        q = La->elem + k-1;					
	        for (++p; p <= q; ++p)
		        *(p-1) = *p;	
            La->elem[k-1] = e;
            --i;
        }
    }
}

int main(void)
{
	SqList L;
	int i=0;
	ElemType e;
	ElemType data[9] = {10,263,-32,-3,-25,88,77,0,-9}; 
	InitList_Sq(&L);
 	for(i = 0;i < 9; i++)
		ListInsert_Sq(&L,i+1,data[i]);

	printf("插入完成后 L = : ");
	ListPrint_Sq(L);
	PartList(&L);
	printf("元素分类后的线性表：");
	ListPrint_Sq(L);
	system("pause");
	return 0;
}