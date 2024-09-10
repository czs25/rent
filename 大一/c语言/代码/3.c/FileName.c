//任务一 崔子硕 20220154592023.10.25
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
	printf("请输入一个无符号十进制整数：");
	scanf_s("%d", &m);
	char* end = tranform_16(m);
	printf("转换为十六进制 = 0x%s\n", end);
}






//任务二 崔子硕 20220154592023.10.25
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
		printf("队列已满")；
	}
	else if (L->length == 0)
	{
		printf("队列为空");
		L->arr[L->rear] = num;
		rear = rear + 1;
		length = length + 1;
	}
	else
	{
		printf("队列既不为空也不满可以插入")；
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


//任务三 崔子硕 20220154592023.10.25
	  s='0 1 2 1 2 3 4 5 6 7 8 9 '
	  p='0 1 2 1 2 3'




//任务四 崔子硕 20220154592023.10.25
#include<stdio.h>
#include<stdlib.h>
void(int* arr, n) {
	if (arr == 0)
	{
		printf("串为空且是对称的")；
	}
	else
	{
		int num = 1;
		while (num != 0)
		{
			if (arr[i]!= arr[sizeof(arr) - 1 - i])
				printf("该串不是对称的"); num = 0;

			else
			{
				break;
			}
			if (i == arr(sizeof(arr) - 1 - i) && i + 1 == arr(sizeof(arr) - 1 - i))
				printf("该串是对称的")；
				num = 0；
		}
	}
}











































////任务一 崔子硕 软件一班 2022015459 10月17日
//#include<stdio.h>
//#include<stdlib.h>
//int a[];
//len = sizeof(a);
//void Seperate（int *a,int len）
//{
//	int c；
//    int j = len - 1;
//	for (int i = 0；i＜j；i++) 
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
////任务二 崔子硕 软件一班 2022015459 10月17日
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
	

  


//任务三 崔子硕 软件一班 2022015459 10月17日
	int b[] = { -10,10,11,19,25,25 };
