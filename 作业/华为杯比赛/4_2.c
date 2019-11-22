#include<stdio.h>

int main(void)
{
    int n,i,j;
    int count;
    int tcnt;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%d",&count);
        int nums[count];
        int cnt=0;
        for(i=0;i<count;i++)
        {
            scanf("%d",&tcnt);
            if(tcnt<0)
            {
                cnt++;
            }
            nums[i]=tcnt;
        }

        for(i=0;i<count-1;i++)
        {
            for(j=0;j<count-i-1;j++)
            {
                if(nums[j]<nums[j+1])
                {
                    tcnt=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tcnt;
                }
            }
        }
        for(i=count-cnt;i<count;i++)
        {
            printf("%d ",nums[i]);
        }
        for(i=0;i<count-cnt;i++)
        {
            printf("%d ",nums[i]);
        }
    }
}