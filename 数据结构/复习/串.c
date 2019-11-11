#include<stdio.h>//2019.11.9night

#define Status      int
#define OK          1
#define ERROR       0

#define maxstrlen 255      // 可在 255 以内定义最大串长
typedef unsigned char SString[maxstrlen+1];     
// 0 号单元存放串的长度。 

// 串联结Concat算法
Status myconcat(SString *T,SString S1,SString S2){
    int i;
    if(S1[0]+S2[0]<=maxstrlen)//没有截断
    {
        for(i=1;i<=S1[0];i++)
        {
            *T[i]=S1[i];
        }
        *T[0]=S1[0];
        for(i=1;i<=S2[0];i++)
        {
            *T[i+S1[0]]=S2[i];
        }
        *T[0]+=S2[0];
    }else
    {
        return ERROR;
    }
    return OK; 
}
//求子串 SubString(&Sub, S, pos, len
/*
    求子串的过程即为复制字符序列的过程，将串 S 
中的第 pos 个字符开始的长度为 len 的字符串复制到 
串 Sub 中。 
注：1)、不会出现“截断”的情况。 
        2)、可能出现“参数非法”的情况，应返回 ERROR。 

*/


int main(int argc, char const *argv[])
{
    
    return 0;
}
