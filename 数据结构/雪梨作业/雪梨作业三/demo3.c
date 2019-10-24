#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define   Status    int
#define   OK        1
#define   ERROR     0
#define   m         5
#define   CHARLEN   10
typedef   char*     QElemType;

typedef struct{
    QElemType Q[m];
    int length;
    int rear;
}SqQueue;

Status InitQueue(SqQueue *Sq)
{
    Sq->length=0;
    Sq->rear=0;
    int i;
    for ( i = 0; i < m; i++)
    {
         Sq->Q[i]=(char *)malloc(sizeof(char)*CHARLEN);
         if(!Sq->Q[i])
         {
             exit(0);
         }
    }
    return OK;    
}

Status EnQueue(SqQueue *Sq,QElemType e)
{
    if(Sq->length!=m)
    {
        //Sq->Q[Sq->rear++]=e;
        strcpy(Sq->Q[Sq->rear++],e);
        Sq->length++;
        //printf("入队 %d  %s \n",Sq->rear-1,Sq->Q[Sq->rear-1]);
        printf("%s已成功入队\n",Sq->Q[Sq->rear-1]);
    }else
    {
        printf("队列已满，请%s等待！\n",e);
    }
    return OK;
}

Status DeQueue(SqQueue *Sq,QElemType *e)
{
    e=&Sq->Q[(Sq->rear-Sq->length+m)%m];
    Sq->length--;
    printf("%s已成功入库\n",*e);
    return OK;
}

Status TraQueue(SqQueue Sq)
{
    printf("队列长度%d其元素如下\n",Sq.length);
    int i;
    for(i=0;i<Sq.length;i++){
        int num=(i+Sq.rear-Sq.length+m)%m;

        printf("%d   %s\n",num,Sq.Q[num]);
    }
    return OK ;
    
}

int main(void)
{
    SqQueue Squeue;
    int i;
    char e[CHARLEN] = {0}, choice;
    char *pe = e;
    InitQueue(&Squeue);

    while(1)
    {
       system("cls");
       printf(" ============================================\n");
       printf("|           1. 排  队                        |\n");
       printf("|           2. 入  库                        |\n");
       printf("|           3. 打  印                        |\n");
       printf("|           4. 退  出                        |\n");
       printf(" ============================================\n");
       printf("请选择:");
       fflush(stdin);
       scanf("%c",&choice);
   
       switch (choice)
       {
       case '1':
           printf("请输入车牌号:");
           scanf("%s",e);
           EnQueue(&Squeue,e);
           break;

       case '2':
            DeQueue(&Squeue,&pe);
            break;
       case '3':
            TraQueue(Squeue);
            break;

        case '4':
            return 0;

       default:
           printf("选择项输入错误，重新选择！\n");
           break;
       }
       system("pause");
    }

    return 0;

}