#include<stdio.h>
int main(void)
{
	//计算两个数的和
//	int num1;
//	int num2;
//	int num3;
//	printf("请输入第一个数：");
//	scanf("%d",&num1);
//	printf("请输入第二个数：");
//	scanf("%d",&num2);
//	num3=num1-num2;
//	printf("这两个数的和是 %d\n",num3);


//	char  name='H';
//	printf("%c",name);
	
//	char name[10];
//	scanf("%s",name);
//	printf("我叫%s",name);

	char name[10];
	int age;
	float height;
	double weight;
	printf("请输入你的姓名：");
	scanf("%s",name);
	printf("请输入你的年龄：");
	scanf("%d",&age); 
	printf("请输入你的身高：");
	scanf("%f",&height); 
	printf("请输入你的体重：");
	scanf("%lf",&weight); 
	printf("我叫%s,我年龄是%d,我身高是%.2f,我体重是%.2lf",name,age,height,weight);

	return 0;
	
	
	
	
	
	
	
	
	
	
	
}
