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
    }
    
    return OK;    
}

Status EnQueue(SqQueue *Sq,QElemType e)
{
    if(Sq->length!=m)
    {
        Sq->Q[Sq->rear]=e;
        Sq->rear++;
        Sq->rear=Sq->rear%m;
        Sq->length++;
        printf("��� %d  %s \n",Sq->rear-1,Sq->Q[Sq->rear-1]);
        printf("%s�ѳɹ����\n",Sq->Q[Sq->rear-1]);
    }else
    {
        printf("������������%s�ȴ���\n",Sq->Q[Sq->rear-1]);
    }
    return OK;
}

Status DeQueue(SqQueue *Sq,QElemType *e)
{
    e=&Sq->Q[(Sq->rear-Sq->length+m)%m];
    Sq->length--;
    printf("%s�ѳɹ����\n",*e);
    return OK;
}

Status TraQueue(SqQueue Sq)
{
    printf("���г���%d��Ԫ������\n",Sq.length);
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
       printf("|           1. ��  ��                        |\n");
       printf("|           2. ��  ��                        |\n");
       printf("|           3. ��  ӡ                        |\n");
       printf("|           4. ��  ��                        |\n");
       printf(" ============================================\n");
       printf("��ѡ��:");
       fflush(stdin);
       scanf("%c",&choice);
   
       switch (choice)
       {
       case '1':
           printf("�����복�ƺ�:");
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
           printf("ѡ���������������ѡ��\n");
           break;
       }
       system("pause");
    }

    return 0;

}
