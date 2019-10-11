#include <assert.h>
#include <stdio.h>
#include <stdlib.h>
#define length 10

 
typedef int DataType;
 
typedef struct Stack
{
	DataType* top;
	DataType* base; //栈顶指针
	int stackSize;
}Stack;

// 栈的实现接口 
//初始化栈
void StackInit(Stack* s){
    s->base=(DataType *)malloc(length*sizeof(DataType));
    if(!s->base)
    {
        exit(0);
    }
    s->top=s->base;
    s->stackSize=length;
}
//压栈 向栈中添加元素
void Push(Stack* s, DataType x){
    if(s->top - s->base >= s->stackSize)
    {
        s->base=(DataType *)realloc(s->base,(s->stackSize+length)*sizeof(DataType));
        if(!s->base)
        {
            exit(0);
        }
        s->top=s->base+s->stackSize;
        s->stackSize+=length;
    }
    *s->top=x;
    s->top++;
}

// 出栈，只单纯的删除一个元素
void Pop(Stack* s){
    if(s->base==s->top)
    {
        exit(0);
    }
    s->top--;
}
//出栈 向栈中删除元素,并返回e值
// DataType Pop(Stack* s){
//     if(s->base== s->top)
//     {
//         exit(0);
//     }
//     e= *s->top;
//     s->top--;
//     return e;
// }
//查看栈顶
DataType StackTop(Stack* s){
    if(s->base==s->top)
    {
        printf("栈为空");
        exit(0);
    }
    return *(s->top-1);
}
//栈的大小
size_t StackSize(Stack* s){
    return s->top-s->base;
}
void Myprint(Stack s)
{
    while (s.top!=s.base-1)
    {
        s.top--;
        printf("%d   ",*(s.top));
        
    }
}

int main()
{
	Stack s;
	int x;
	int i;
	StackInit(&s);
 
	Push(&s, 6);
	Push(&s, 5);
	Push(&s, 4);
    printf("~~~%d \n",Pop(&s));
    Push(&s,3);
    Push(&s,2);
    Push(&s,1);

 
	x = StackSize(&s);
 
	i = s.stackSize;
	printf("\n%d  ,  %d \n",i,x);
    Myprint(s);

	system("pause");
	return 0;
}

