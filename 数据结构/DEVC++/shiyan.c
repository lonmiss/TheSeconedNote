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
	printf("������%s\n",name);
	printf("���䣺%d\n",age);
	printf("��ߣ�%f\n",height);
	printf("���أ�%lf\n",weight);
	printf("~~~~~~~~~~\n");
	return 0;
}
