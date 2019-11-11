#include<stdio.h>

int ContainSameElem(int *a,int m,int n)
{
    int i,j;
    int cnt=0;
    for(i=0;i<m*n;i++)
    {
        for(j=i+1;j<m*n;j++)
        {
            if(*(a+i)==*(a+j))
            {
                printf("a[%d][%d]=%d\n",i/4,i%3,*(a+i));
                printf("a[%d][%d]=%d\n",j/4+1,j%3,*(a+j));
                cnt++;
            }
        }
    }
    if(cnt>0)
    {
        return 1;
    }else
    {
        return 0;
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
