#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#define Status      int
#define OK          1
#define ERROR       0
#define OVERFLOW    -2

typedef struct {
    char *ch;
    int length;  
}HString;

// ：串赋值函数，完成将chars指向的字符串赋值给T指向的定长顺序串;
Status StrAssign(HString *T,char *chars){
    if(T->ch){
        free(T->ch);
    }
    T->length=0;
    T->ch=(char *)malloc(sizeof(char)*strlen(chars));
    int i;
    for ( i = 0; chars[i]; i++)
    {
        T->ch[i]=chars[i];
        T->length++;
    }
    T->ch[i]='\0';
    return OK;
}
//：串比较函数，S中的字符和T中字符比较，若S>T,返回大于0的数；若S=T，返回0；若S<T，返回小于0的数
int StrCompare(HString S,HString T){
    int i;
    for(i=0;i<S.length&&i<T.length;i++){
        if(S.ch[i]!=T.ch[i])
        {
            return S.ch[i]-T.ch[i];
        }
    }
    return S.length-T.length;
}
//求子串函数  
Status SubString(HString *Sub,HString S,int pos,int len)
{
    //	//用Sub返回串S的第pos个字符起长度为len的子串
    if(pos<1||pos>S.length||len<0||len>S.length-pos+1){
        return ERROR;
    }
    if(Sub->ch){
        free(Sub->ch);
        Sub->ch=(char *)malloc(sizeof(char)*len);
        Sub->length=0;
    }
    int i;
    for(i=0;i<len;i++){
        Sub->ch[i]=S.ch[pos-1+i];
        Sub->length++;
    }
    return OK;
}
//将S中的字符打印出来    
void PrintStr(HString S){
    int i;
    for ( i = 0; i<S.length; i++)
    {
        printf("%c",S.ch[i]);
    }
    printf("\n");
}
//查找S中是否有与T相同的子串，有的话，删除，返回ERROR；没有的话，返回OK。
Status Strfun(HString *S,HString T)
{
    int i;
    int flag=0,j;
    int cnt=0;//判断是否有相同的子串 
    for(i=0;i<S->length-T.length+1;i++)
    {
    	if(S->ch[i]==T.ch[0]){
    		for(j=1;j<T.length;j++)
    		{
    			if(S->ch[j+i]!=T.ch[j])
    			{
    				flag++;
    			}
    		}
    		if(flag==0)
    		{
    			for(j=i;j<S->length-T.length;j++)
    			{
    				S->ch[j]=S->ch[j+T.length];
    			}
    			S->length-=T.length;
    			cnt++;
    		}
    		flag=0;
    	}
    }
    if(cnt>0)
	{
		return ERROR;
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
    printf("%d \n",StrCompare(S,T));

    return 0;
}