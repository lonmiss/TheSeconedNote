#include<stdio.h>
int main(void)
{
	//�����������ĺ�
//	int num1;
//	int num2;
//	int num3;
//	printf("�������һ������");
//	scanf("%d",&num1);
//	printf("������ڶ�������");
//	scanf("%d",&num2);
//	num3=num1-num2;
//	printf("���������ĺ��� %d\n",num3);


//	char  name='H';
//	printf("%c",name);
	
//	char name[10];
//	scanf("%s",name);
//	printf("�ҽ�%s",name);

	char name[10];
	int age;
	float height;
	double weight;
	printf("���������������");
	scanf("%s",name);
	printf("������������䣺");
	scanf("%d",&age); 
	printf("�����������ߣ�");
	scanf("%f",&height); 
	printf("������������أ�");
	scanf("%lf",&weight); 
	printf("�ҽ�%s,��������%d,�������%.2f,��������%.2lf",name,age,height,weight);

	return 0;
	
	
	
	
	
	
	
	
	
	
	
}
