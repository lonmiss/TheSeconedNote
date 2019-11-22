#include<stdio.h>

int main(void)
{
    int a,b;
    scanf("%d %d",&a,&b);
    int c=a+b;
    int nums[8];
    int i,j;
    for(i=0;i<8;i++)
    {
        nums[i]=0;
    }

    if(b==0)
    {
        printf("1.00000000\n");
    }else if(a==0)
    {
        printf("0.00000000\n");
    }else
    {
        double az=a*1.0/10;
        double az1=c*1.0/100;
    	for(j=0;j<8;j++)
        {
            i=0;
            for(i=0;i<11;i++)
            {
                if(az1*i>az)
                {
                    break;
                }
            }
            nums[j]=i-1;
            az=(az-az1*(i-1))*10;
        }
        
        printf("0.\n");
        for(i=0;i<8;i++)
        {
            printf("%d\n",nums[i]);
        }   
    }
   
    return 0;
}