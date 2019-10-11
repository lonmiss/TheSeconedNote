#include<stdio.h>
int main(void)
{
	char name[10];
	scanf("%s",name);
	int age;
	scanf("%d",&age);
	float height;
	scanf("%f",&height);
	double weight;
	scanf("%lf",&weight);
	printf("~~~~~~~~~~\n");
	printf("姓名：%s\n",name);
	printf("年龄：%d\n",age);
	printf("身高：%f\n",height);
	printf("体重：%lf\n",weight);
	printf("~~~~~~~~~~\n");
	return 0;
}
