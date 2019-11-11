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
    for ( i = 0; i < n; i++)
    {
        printf("%d ",next[i]);
    }
    printf("\n");
}
int main() {
    char arr[]="abaaa";
    int *brr;
    SeekNext(arr,brr);
    int *brr1;
    char arr1[]="aabbaaabaaaacb";
    SeekNext(arr1,brr1);
    return 0;
}