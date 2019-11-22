#include<stdio.h>

int main(void)
{
    int n;
    scanf("%d",&n);
    int i,j;
    int nums[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&nums[i]);
    }
    int max=nums[1]-nums[0];
    int cnt;
    int min=nums[0];
    for(i=1;i<n;i++)
    {
        cnt=nums[i]-min;
        if(cnt<0){
            min=nums[i];
        }
        if(cnt>max)
        {
            max=cnt;
        }
    }
    printf("%d\n",max);
    return 0;
}