#include<stdio.h>
int main(void) {
    int n,x;
    scanf("%d %d",&n,&x);
    int opt,t;
    while (n--)
    {
        scanf("%d %d",&opt,&t);
        if(opt==1){
            x+=t;
        }
        if(opt==2){
            x-=t;
        }
        if (opt==3)
        {
            x*=t;
        }
        if(opt==4){
            x/=t;
        }
    }
    printf("%d\n",x);
    return 0;
}