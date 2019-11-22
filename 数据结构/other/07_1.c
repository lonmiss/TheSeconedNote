#include<stdio.h>

int ContainSameElem(int *a,int m,int n) //若二维数组中有相同元素返回1，并输出相同元素值，及下标位置，详见运行效果；如果没有相同元素返回0
{
	int i,j;
	for(i = 0;i < m*n;i++)
	{
		for(j = 0;j < i;j++)
		{
            printf("i=%d   j=%d\n",i,j);
			if(*(a + j) == *(a + i))
			{
				printf("%d",*(a + j));
				printf("%d",j);
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
}

int main(void)
{
    int a[4][3]={11, 12, 13, 24, 25, 26, 13, 38, 39, 40, 39, 42};

    if(ContainSameElem(a[0],4,3))
        printf("a有相同元素!\n");
    else
        printf("a无相同元素\n");

    return 0;

}