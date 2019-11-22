#include<stdio.h>
int main(int argc, char const *argv[])
{
    int n;
    int a,b,c;
    int i;
    scanf("%d",&n);
    int cnt=0;
    int max=0;
    int flag;
    for ( i = 0; i < n; i++)
    {
        scanf("%d %d %d",&a,&b,&c);
        cnt=a+b+c;
        if(cnt>max){
            max=cnt;
            flag=i;
        }
    }
    printf("%d\n",i+1);
    return 0;
}
