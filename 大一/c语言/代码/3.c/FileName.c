//����һ ����˶ 20220154592023.10.25
#include<stdio.h>
#include<stdlib.h>

char* tranform_16(unsigned int m)
{
	static char arr[9] = { 0 };
	for (int i = 7; i >= 0; i--)
	{
		int num = m % 16;
		if (num < 10)
		{
			arr[i] = num + '0';
		}
		else
		{
			arr[i] = num - 10 + 'A';
		}
		m = m / 16;
	}
	return arr;
}


int main(void)
{
	int m;
	printf("������һ���޷���ʮ����������");
	scanf_s("%d", &m);
	char* end = tranform_16(m);
	printf("ת��Ϊʮ������ = 0x%s\n", end);
}






//����� ����˶ 20220154592023.10.25
#include<stdio.h>
#include<stdlib.h>
typedef struct Node {
	int arr[n];
	int rear;
	int length;
}Node;
void woke(Node* L, int num) {
	if (L->length == n;)
	{
		printf("��������")��
	}
	else if (L->length == 0)
	{
		printf("����Ϊ��");
		L->arr[L->rear] = num;
		rear = rear + 1;
		length = length + 1;
	}
	else
	{
		printf("���мȲ�Ϊ��Ҳ�������Բ���")��
			L->arr[L->rear] = num;
		rear = rear + 1;
		length = length + 1;
	}
}
int main(void) {
	Node* L;
	L->length = 0;
	L->rear = 0;
	woke(&L, 1);
}


//������ ����˶ 20220154592023.10.25
	  s='0 1 2 1 2 3 4 5 6 7 8 9 '
	  p='0 1 2 1 2 3'




//������ ����˶ 20220154592023.10.25
#include<stdio.h>
#include<stdlib.h>
void(int* arr, n) {
	if (arr == 0)
	{
		printf("��Ϊ�����ǶԳƵ�")��
	}
	else
	{
		int num = 1;
		while (num != 0)
		{
			if (arr[i]!= arr[sizeof(arr) - 1 - i])
				printf("�ô����ǶԳƵ�"); num = 0;

			else
			{
				break;
			}
			if (i == arr(sizeof(arr) - 1 - i) && i + 1 == arr(sizeof(arr) - 1 - i))
				printf("�ô��ǶԳƵ�")��
				num = 0��
		}
	}
}











































////����һ ����˶ ���һ�� 2022015459 10��17��
//#include<stdio.h>
//#include<stdlib.h>
//int a[];
//len = sizeof(a);
//void Seperate��int *a,int len��
//{
//	int c��
//    int j = len - 1;
//	for (int i = 0��i��j��i++) 
//	{
//		{
//			if (a[i] % 2 == 0;)
//			{
//				if (a[j] % 2 == 1)
//				{
//					c = a[i];
//					a[i] = a[j];
//					a[j] = c;
//					i++;
//				}
//				j--;
//			}
//			else
//				i++;
//		}
//	}
//
//}
// 
//
//
////����� ����˶ ���һ�� 2022015459 10��17��
//#include<stdio.h>
//#include<stdlib.h>
//
//typedef struct Node {
//	int data;
//	struct Node* next;
//}Node;
//int main() {
//	Node* p = (Node*)malloc(sizeof(Node));
//	int number = 0;
//	scanf_s("%d", &number);
//	Node* pointer = p;
//	for (int i = 0; i < number; i++)
//	{
//		Node* a = (Node*)malloc(sizeof(Node));
//		pointer->next = a;
//		a->next = NULL;
//		scanf_s("%d", &(a->data));
//		pointer = a;
//	}
//	while (p->next) {
//		printf("%d", p->next->data);
//		p->next = p->next->next;
//	}
//}
//void Delete(Node* head)
//{
//	Node* a = head->next;
//	Node* b = a->next;
//	for (int j = 0; j < number-1; j++)
//	{
//		for (int i = 0; i < number-i-1; i++)
//		{
//			if (a->data != b->data)
//				b = b->next;
//			else
//				a->next = b->next; free(b);
//		}
//		a = a->next;
//	}
	

  


//������ ����˶ ���һ�� 2022015459 10��17��
	int b[] = { -10,10,11,19,25,25 };
