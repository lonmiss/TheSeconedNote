#include<stdio.h>

typedef struct{
    int elem[100];
    int length;
}SqList;

// 初始化
void InitList_Sq(SqList *L){
    L=malloc(sizeof(SqList));
    L->length=0;
}
//插入数据
ListInsert(SqList *L,int i,int data){
    L->elem[i]=data;
    L->length++;
}
void ListPrint(SqList l){
    int i=0;
    for (int i = 0; i < l.length; i++)
    {
        printf("%d ",l.elem[i]);
    }
    
}

int main(int argc, char const *argv[])
{
    SqList L;
    int i=0;
    int e;
    int data[9]={10,263,-32,-3,-25,88,77,0,-9};
    InitList_Sq(&L);
    for(i = 1;i <= 9;i++)
      ListInsert(&L,i,data[i-1]);
    printf("插入完成后L = : ");
    ListPrint(L);
    return 0;
}
