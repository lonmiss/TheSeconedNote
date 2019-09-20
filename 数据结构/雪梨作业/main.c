#include <stdio.h>
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
