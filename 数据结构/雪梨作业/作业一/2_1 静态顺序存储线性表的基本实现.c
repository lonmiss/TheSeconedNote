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
//输出打印：void ListPrint(SqList L);
void ListPrint(SqList L){

}
ListInsert(SqList *L,int i,int data){
    
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
