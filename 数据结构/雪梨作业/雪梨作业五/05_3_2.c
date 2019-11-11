#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void SeekNext(char* arr,int* next)
{
    int n=strlen(arr);
    int i=1,j;
    int len=0;
    next=malloc(sizeof(int)*n);
    next[0]=0;
    while(i<n)
    {
        if(arr[len]==arr[i]){
            len++;
            next[i]=len;
            i++;
        }else if(len>0){
            len=next[len-1];
        }else{
        	next[i]=len;
            i++;
        }
    }
    for(i=n-1;i>0;i--)
    {
        next[i]=next[i-1];
    }
    next[0]=-1;
}
int SeekTarget(char *arr1,char *arr,int *brr)
{
    int i=0,j=0;
    int len=strlen(arr1);
    while (i<len)
    {
        if(arr[j]==arr1[i])
        {
            j++;
            i++;
        }else
        {
            j=brr[j];
            if(j==-1)
            {
                i++;
                j++;
            }
        }
        while (j==strlen(arr))
        {
            return i-j;
        }        
    }
    return -1;
    
}
int main() {
    char arr[]="abaaa";
    int *brr;
    SeekNext(arr,brr);
    char arr1[]="aabbaaabaaaacb";
    printf("%d\n",SeekTarget(arr1,arr,brr));
    return 0;
}