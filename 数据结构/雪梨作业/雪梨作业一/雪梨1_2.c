#include<stdio.h>
#include<stdlib.h>

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

void InitList_Sq(SqList *l)
{
	l->elem=(int *)malloc(LIST_INIT_SIZE*sizeof(ElemType));
	if(!l->elem)
	{
		exit(OVERFLOW);
	}
	l->length=0;
	l->listsize=LIST_INIT_SIZE;
}
void ListInsert_Sq(SqList *l,int i,int data){
	l->elem[i-1]=data;
	l->length++;
}
void ListPrint_Sq(SqList L)
{
	int i;
	for(i=0;i<L.length;i++)
	{
		printf("%d ",L.elem[i]);
	}
	printf("\n");
}
void PartList(SqList *La)
{
	int a1=0,a2=0;
	int sum1[LISTINCREMENT];//负数 
	int sum2[LISTINCREMENT];//正数 
	int flag=0;//判断存在几个0 
	int i;
	for(i=0;i<La->length;i++)
	{
		if(La->elem[i]!=0)
		{
			if(La->elem[i]<0)
			{
				sum1[a1++]=La->elem[i]; 
			}else{
				sum2[a2++]=La->elem[i]; 
			} 
		}else
		{
			flag++;
		} 
	}
	for(i=0;i<a2;i++)
	{
		La->elem[i]=sum2[i];
	}
	for(i=0;i<flag;i++)
	{
		La->elem[a2+i]=0;
	}
	for(i=0;i<a1;i++)
	{
		La->elem[a2+flag+i]=sum1[i];
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

 

