#include<stdio.h>
int panduan(int n)
{
    int i;
    int flag=0;
    for(i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    return flag;
}

int main(void)
{
    int nums[1229];
    int i,j;
    int cnt=0;
    for(i=2;i<=10000;i++)
    {
        int flag=0;
        for(j=2;j*j<=i;j++)
        {
            if(i%j==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            nums[cnt++]=i;
        }
    }

    int n,x;
    int result=0;
    int j;
    int flag1=0;
    scanf("%d %d",&n,&x);
    while (n!=0&&x!=0)
    {
        result=0;
        flag1=0;
        for(i=0;nums[i]<=n;i++)
        {
            int cnt1=n-nums[i];
            for(j=0;nums[j]<=cnt1;j++)
            {
                if(cnt1==nums[j])
                {
                    flag1=1;
                    result++;
                    break;
                }
            }
        }
        printf("%d\n",result*x);
        scanf("%d %d",&n,&x);
    }
    return 0; 
    
}