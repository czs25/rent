//#include<stdio.h>
// void main() 
//{
//	void printstar();
//	void print_samfaof();
//	
//	printstar();
//	print_samfaof();
//}
//	
//void printstar()
//{
//	printf("******\n");
//}
//void print_samfaof()
//{
//	printf("�������򵥵ĺ���");
//}

//#include<stdio.h>
//void main()
//{
//	int max(int x, int y);
//	int a,b,c;
//	
//	scanf("%d%d",&a,&b);
//	c=max(a,b);
//	printf("max is %d",c);
//	
//}
//
//int max(int x, int y)
//{
//	int z;
//	z=x>y?x:y;
//	
//	return z;
//}

// #include<stdio.h>
// int main()
// {
// 	char* name[5]={"hello","china","beijing","projiet","haha"};
//    int i;
//    for(i=0;i<5;i++)
//    {
//    	printf("%s\n",name[i]);
//	}
//	return 0;
// }

//#include<stdio.h>
//#include<stdlib.h>
//#include<string.h>
//int main()
//{
//	char* str;
//	str = (char*)malloc(20);
//	strcpy(str,"I love C");
//	printf("%s\n",str);
//	
//	str="y shi haha";
//	printf("%s\n",str);
//}

//#include<stdio.h>
////int main()
////{
////	int a[10];
////	printf("a=%p\n",a);
////	printf("a+1=%p\n",a+1);
////	
////	printf("&a=%p\n",&a);//int(*p)[10]
////	printf("&a+1=%p\n",&a+1);
////	
////	
////	
////	return 0;
////}
//
//#include<stdio.h>
//	struct stu{
//		int num;
//		char name[20];
//		char sex;
//		int* addr;
//	};
//	
//int main()
//{
//	struct stu hjn;
//	hjn.num=20;
//	//hjn.name="hjn"  ������Ϊhjn.name�Ǹ���������֣��Ǹ����������ٵȺ���ߡ�
//	strcpy(hjn.name,"hjn") ;
//	printf("hjn.num=%d\n",hjn.num);
//	printf("hjn.name=%s\n",hjn.name);
//	
//	
//	//strcpy(hjn.addr,"beijing")����hjn.addr�Ǹ�Ұָ��
//	hjn.addr="beijing";
//	printf("%s\n",hjn.addr) ;
//	
//	
//	return 0;
//}
//
//#include<stdio.h>
//struct stu{
//	int num;
//	char name[20];
//};
//int main()
//{
//	struct stu boy={101,"lilei"};
//	struct stu*p;
//	p=&boy;
//	printf("sizeof(p)=%d\n",sizeof(p));
//	printf("boy.name=%s\n",boy.name);
//	printf("boy.name=%s\n",p->name);
//	printf("boy.name=%s\n",(*p).name);
//	
//	
//	return 0;
////}
//
//#include<stdio.h>
//struct stu{
//	char* a;
//	char b;
//};
//int main()
//{
//	struct stu boy;
//	printf("sizeof(boy)=%d",sizeof(boy));
//	
//	
//	return 0;
//}

#include<stdio.h>
#include<stdlib.h>
	struct node{
		int value;
		struct node* next;
	};
	
//����������ͷ��
//struct node* list_creat(){
//
//struct node*list=(struct node*)malloc(sizeof(struct node)) ;
//if(list==NULL)
//{
//	return NULL; 
//}
//list->next = NULL;//0
//return list;
//}

//c�����������
//struct node a;
//struct node b;
//struct node v;
//struct node*p;
//p=&a;
//a.next=&b;
//b.next=&c;
//c.next=NULL;
//
//a.value=1;
//b.value=2;
//b.value=3;
//int main()
//{
//	printf("a-next=%p\n",a->next);
//	printf("b-next=%p\n",b->next);
//	printf("c-next=%p\n",c->next);
//	printf("c�ĵ�ַ��%p",&c)
//	
//	printf("a->value=%d",a->value);
//	printf("b->value=%d",c->value);
//	printf("c->value=%d",c->value);
//}


 
//ʹ�����鴴��һ������
//struct node*list_creat(int data[],int N){
////����ͷ�ڵ�
//struct node*list=(struct node*)malloc(sizeof(struct node));
//if(list==NULL)
//{
//	return NULL;
//}
//
// struct node* list;
// 
// for(int i=0;i<N;i++)
// {
//    //�����½ڵ�
//    struct node*tmp=(struct node*)malloc(sizeof(struct node));
//    //��������
//	tmp->value=data[i];
//	//����
//	p->next=tmp;
//	//pָ�����
//	p=p->next; 
// }
//}
 
// void list_visit(struct node*list)
// {
// 	if(list==NULL)
// 	{
// 		return 0;  
//	 }
//	 for(struct node* p=list->next;p;p=p->next)
//	 {
//	 	printf("%d",p->value);
//	 }
// }
// int main()
// {
// 	int data[5]={1,2,3,4,5,};
// 	
// 	struct node* list=list_creat(data,10);
// 	
// 	list_visit(list);
// }


#include<stdio.h>
#include<stdlib.h>
struct Node{
	int data;
	struct Node* next;
};
//��̬�������� 
//int main()
//{
//	struct node a={1,NULL};
//	struct node b={2,NULL};
//	struct node c={3,NULL};
//}
//��̬������������̬������+ģ�黯��� 
struct Node* creatList()
{
	struct Node* headNode=(struct Node*)malloc(struct Node);
	//headNode ��Ϊ�˽ṹ�����   ����ʹ��ǰ�����ʼ��
	//headNode->data=1;
	headNode->data=NULL;
	return headNode; 
}
struct Node*creatNode(int data)
{
	struct Node* newNode=(struct Node*)malloc(struct Node);
	newNode->data=data;
	newNode->next=NULL;
}
//��ӡ����
void print(struct Node* headNode)
{
	while(pmove)
	{
		printf("%d\t",pmove->data);
		pmove=pmove->next;
	}
	printf("\n");
 }
 //����ڵ㣬�����������Ǹ���������ڵ�������Ƕ��١�
 void insert(struct Node* headNode,int data)
 {
 	//��������Ľڵ�
	 struct Node*newNode=creatNode(data);
	 newNode->next=headNode->next;
	 headNode->next=newNode; 
  } 
  
  void delet(struct Node*headNode,int posdata)
  {
  	struct Node*posNode=headNode->next;
  	struct Node*posNodefront=headNode;
  	if(posNode==NULL){
  		printf("�޷�ɾ��������Ϊ��");
	  }
	else
	{
	while(posNode->data!=posdata)
	{
		posNodefront=posNode;
		posNode=posNodefront->next;
		if(posNode==NULL)
		{
			printf("û���ҵ������Ϣ���޷�ɾ��\n");
			return;
		}
	}
	posNodefront->next=posNode->next;
	free(posNode);
}
  }


















