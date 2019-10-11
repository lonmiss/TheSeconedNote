#include<stdio.h>
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
    int i=0;
    int j=0;
    for( i=0;i<L->length;i++)
    {
        if(L->elem[i]>-32&&L->elem[i]<88)
        {
            L->elem[i]=NULL;
        }
    }
    for(i=0;i<L->length;i++)
    {
        if(L->elem[i]==NULL)
        {
            for(j=i+1;j<L->length;j++)
            {
                if(L->elem[j]!=NULL)
                {
                    L->elem[i]=L->elem[j];
                    L->elem[j]=NULL;
                    break;
                }
            }
        }
    }
    for(i=0;i<L->length;i++)
    {
        if(L->elem[i]==NULL)
        {
            L->length=i;
            break;
        }
    }
}
Status InitList_Sq(SqList *L)
{
	L->length=0;
	int i;
	for(i=0;i<LIST_INITSIZE;i++){
		L->elem[i]=NULL;
	}
	return OK;
}
void ListInsert(SqList* N,int i,ElemType n)
{
	N->length = i;
	N->elem[i-1]=n;

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
   ListPrint(L);//输出打印
   DeleteElem(&L);//删除操作
   printf("删除比第三个元素大的且比第六个元素小的数据元素： ");
   ListPrint(L);
   system("pause");
   return 0;
}



/*#include<stdio.h>
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
void ListPrint_Sq(SqList L)
{
    for(int i=0;i<L.length;i++)
	{
		printf("%d ",L.elem[i]);
	}
	printf("\n");
}
void PartList(SqList *La)
{
    ElemType e;
    int j=0;
    for(int i=0;i<La->length;i++)
    {
        if(La->elem[i]<0)
        {
            for(j=i+1;j<La->length;j++)
            {
                if(La->elem[j]>=0)
                {

                    e=La->elem[i];
                    La->elem[i]=La->elem[j];
                    for(j;j>i+1;j--)
                    {
                        La->elem[j]=La->elem[j-1];
                    }
                    La->elem[i+1]=e;
                    break;
                }
            }
        }
    }
}
Status InitList_Sq(SqList *L)
{
    L->elem=(ElemType*)malloc(LISTINCREMENT*sizeof(ElemType));
    if(!L->elem)
    {
        printf("初始化失败");
        exit(OVERFLOW);
    }
    L->length=0;
    L->listsize=LISTINCREMENT;

}
void ListInsert_Sq(SqList* L,int i,ElemType n)
{
	L->length = i;
	L->elem[i-1]=n;

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
}*/

