#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define Status      int
#define OK          1
#define ERROR       0
#define OVERFLOW    -2

typedef struct {
    char *ch;
    int length;
}HString;

Status StrAssign(HString *T,char *chars)
{
     int i;
    T->ch=(char *)malloc(strlen(chars)* sizeof(char));
    T->length = strlen(chars);
    for(i=0;i<T->length;++i){
        T->ch[i]=chars[i];
    }
    return OK;
}
int StrCompare(HString S,HString T)
{
    int i;
    for(i=0;i<S.length&&i<T.length;++i)
    {
        if(S.ch[i]!=T.ch[i])
            return S.ch[i] - T.ch[i];
    }
    return S.length-T.length;
}

Status SubString(HString *Sub,HString S,int pos,int len)
{
    int i;
    if(pos<1||pos>S.length||len<0||len>S.length-pos+1)
        return ERROR;
    if(Sub->ch)
        free(Sub->ch);
    if(!len)
    {
        Sub->ch = NULL;
        Sub->length = 0;
    }
    else
    {
        Sub->ch = (char*)malloc(len*sizeof(char));
        for(i=0;i<len;i++)
        {
            Sub->ch[i] = S.ch[pos+i];
        }
        Sub->length = len;
    }
    return OK;
}

void PrintStr(HString S)
{
    int i;
    for(i=0;i<S.length;i++)
    {
        printf("%c",S.ch[i]);
    }
    printf("\n");
}

Status Strfun(HString *S,HString T)
{
    int i,j;
    int cc=0;
    for(i=0;i<S->length;i++)
    {
        if(S->ch[i]==T.ch[0])
        {
            for(j=0;j<T.length;j++)
            {
                if(S->ch[i+j]==T.ch[j]){
                    cc++;
                }
            }
            if(cc==T.length)
            {
                for(j=i;j<S->length-T.length;j++)
                {
                    S->ch[j]=S->ch[j+T.length];
                    S->length-=T.length;
                    S->ch[S->length]='\0';
                }
            }
        }
        cc=0;
    }
    return OK;
}


int main(void)
{
    HString S ,T;
    S.ch = T.ch = NULL;
    StrAssign(&S ,"abcFGdeFGHiGH");
    PrintStr(S);

    StrAssign(&T ,"FGH");
    PrintStr(T);

    Strfun(&S,T);
    PrintStr(S);

    return 0;
}



// #include <stdio.h>
// #include <string.h>

// #define Status      int
// #define OK           1
// #define ERROR        0
// #define INFEASIBLE  -1
// typedef struct {
//     char *ch;
//     int length;
// }HString;
// // 串赋值函数
// Status StrAssign(HString *T,char *chars) {
//     int i;
//     T->ch = malloc(strlen(chars)*sizeof(char));
//     T->length = 0;
//     for (i=0;chars[i]!='\0';i++){
//         T->ch[i]=chars[i];
//         T->length++;
//     }
//     T->ch[i]='\0';
    
//     // for (i=0;i<T->length;++i){
//     //     T->ch[i] = chars[i];
//     // }
//     return OK;
// }
// //串比较函数
// int StrCompare(HString S,HString T){
//     if ((strcmp(S.ch,T.ch))>0){
//         return OK;
//     }
//     // if ((strcmp(S.ch,T.ch))==0){
//     //     return 0;
//     // }
//     if ((strcmp(S.ch,T.ch))<0){
//         return INFEASIBLE;
//     }
//     return ERROR;
// }
// //求子串函数
// Status SubString(HString *Sub,HString S,int pos,int len){
//     int i;
//     Sub->ch = (char*)malloc(len*sizeof(char));
//     Sub->length = 0;
//     for (i=0;i<len;i++){
//         Sub->ch[i]=S.ch[i+pos];
//         Sub->length++;
//     }
//     Sub->ch[i]='\0';
//     return OK;
// }
// //打印函数
// void PrintStr(HString S){
//     int i;
//     for (i=0;S.ch[i]!='\0';i++){
//         printf("%c",S.ch[i]);
//     }
//     printf("\n");
// }
// //查找函数（有相同部分则删除）
// Status Strfun(HString *S,HString T){
//     int i,j,h;
//     int biaozhi=0;
//     for (i=0;i<S->length;++i)
//     {
//         for (j=i;j<i+T.length;++j){
//             if (S->ch[j]==T.ch[j-i]){
//                 biaozhi++;
//             }
//         }
//         if (biaozhi==T.length){
//             break;
//         }
//         biaozhi=0;
//     }
//     for (h=i;h<S->length-T.length;h++){
//         S->ch[h]=S->ch[h+T.length];
//     }
//     S->length-=T.length;
//     return OK;
// }
// int main(void)
// {
//     HString S ,T ,Y;
//     S.ch = T.ch = Y.ch = NULL;
//     StrAssign(&S ,"abcFGdeFGHiGH");
//     PrintStr(S);
//     StrAssign(&T ,"FGH");
//     PrintStr(T);
//     SubString(&Y ,S,0,4);
//     PrintStr(Y);
//     Strfun(&S,T);
//     PrintStr(S);

//     return 0;
// }
