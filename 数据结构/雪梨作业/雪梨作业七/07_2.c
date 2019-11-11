#include<stdio.h>

#define Status      int
#define OK          1
#define ERROR       0
#define MAXSIZE 12500

typedef struct{
    int i,j;      //行数，列数
    int e;        //非零元素值

}Triple;

typedef struct{
    Triple data[MAXSIZE + 1]; 
    int mu,nu,tu;   //矩阵的行数、列数、以及非零元素的个数       
}TSMatrix;

// //：判断矩阵M是否是对称矩阵，如果是，返回OK，如果不是，返回ERROR;
Status JudgingSymmetricMatrix(TSMatrix M) 
{
    int cnt=0;
    int i,j;
    for(i=1;i<=M.tu;i++)
    {
        for ( j = 1; j <= M.tu; j++)
        {
            if((M.data[i].e==M.data[j].e)&&(M.data[i].i==M.data[j].j)&&(M.data[i].j==M.data[j].i))
            {
                cnt++;
            }
        }
    }
    if(cnt==M.tu)
    {
        return OK;
    }else
    {
        return ERROR;
    }
    
    
}

//：将矩阵M打印输出，输出效果见运行效果。
void PrintMatrix(TSMatrix M){
    int i,j,k=1;
    for(i=1;i<=M.mu;i++)
    {
        for(j=1;j<=M.nu;j++)
        {
            if(M.data[k].i==i&&M.data[k].j==j)
            {
                printf("%d	",M.data[k].e);
                k++;
            }else
            {
                printf("%d	",0);
            }
        }
        printf("\n");
    }

}
int main(void)
{
    TSMatrix M;
    M.mu = 4; M.nu = 4; M.tu = 4;
    M.data[1].i = 1; M.data[1].j = 1; M.data[1].e = 3;
    M.data[2].i = 1; M.data[2].j = 4; M.data[2].e = 5;
    M.data[3].i = 2; M.data[3].j = 2; M.data[3].e = -1;
    M.data[4].i = 3; M.data[4].j = 1; M.data[4].e = 2;
    if(JudgingSymmetricMatrix(M))
        printf("是对称矩阵！\n");
    else
        printf("不是对称矩阵！\n");
    PrintMatrix(M);

    return 0;
}