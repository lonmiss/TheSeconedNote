#include<stdio.h>

int main(void)
{
    int n;
    int count;
    int i,j;
    int t;
    int geshu;
    scanf("%d",&n);
    while (n--)
    {
        scanf("%d",&count);
        int nums[count];
        for(i=0;i<count;i++)
        {
            scanf("%d",&t);
            nums[i]=t;
            if(t<0)
            {
                geshu++;
            }
        }

        for(i=0;i<count-1;i++)
        {
            for(j=0;j<count-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }

        for(i=0;i<geshu;i++)
        {
            printf("%d ",nums[i]);
        }
        for(i=count-1;i>=geshu;i--){
            printf("%d ",nums[i]);
        }
        printf("\n");
        geshu=0;
    }
    return 0;
}
