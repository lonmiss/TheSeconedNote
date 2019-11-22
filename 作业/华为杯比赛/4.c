#include<stdio.h>

int main(int argc, char const *argv[])
{
    int n;
    scanf("%d",&n);
    int count;
    while(n--){
        scanf("%d",&count);
        int a=0,b=0,t;
        int nums[count];
        while (count--)
        {
            scanf("%d",&t);
            nums[a++];
            if(t<0)
            {
            	b++;
            }
        }
        int i,j;

        for(i=0;i<a-1;i++)
        {
            for(j=0;j<a-i-1;j++)
            {
                int tcnt;
                if(nums[j]<nums[j+1])
                {
                    tcnt=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tcnt;
                }
            }
        }

        for(i=b-1;i>=0;i--)
        {
            printf("%d ",nums[i]);
        }
        for(i=b;i<a;i++)
        {
            printf("%d ",nums[i]);
        }
        printf("\n");
        getchar();
    }
    return 0;
}
