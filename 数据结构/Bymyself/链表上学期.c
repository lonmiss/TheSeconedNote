#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node * next;
} Node;

void printList(Node * head) {
    for(; head!=NULL; head=head->next)
        printf("%d ", head->data);
    puts("");
}
int sizeList(Node * head) {
    int n;
    for(n=0; head!=NULL; ++n)
        head = head->next;
    return n;
}
void pushBackList(Node ** pList , int data) {
    Node * newNode = (Node *)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;
    if(*pList == NULL) { // 空链表
        *pList = newNode;
    } else { // 链表不为空
        Node * head = *pList;
        while(head->next != NULL) 
            head = head->next;
        head->next = newNode;
    }
}
void freeList(Node ** pList) {
    Node * head = *pList;
    Node * temp;
    while(head!=NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }
    *pList = NULL;
}

// 在index位置插入新节点
// return 0 插入失败  1 插入成功
int insertList(Node ** pList, int index, int data) {
    Node * newNode = NULL;
    int i;
    Node * head = *pList;
    int len = sizeList(*pList);
    if(index<0 || index>len)
        return 0;
    
    newNode = (Node *)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;

    if(index == 0) {
        newNode->next = *pList;
        *pList = newNode;
        return 1;
    }

    for(i=1; i<index; ++i)
        head = head->next;

    newNode->next = head->next;
    head->next = newNode;
    return 1;
}

// 在链表中查找数据域值为data的节点，如果找到返回
// 节点位置，未找到返回-1
int findList(Node * list, int data) {
    int i;
    for(i=0; list!=NULL; list=list->next,i++)
        if(list->data==data)
            return i;
    return -1;
}

// 给定两个有序链表，合并两个有序链表，合并时
// 不创建新的节点，直接使用原有链表节点，合并完成后
// 原链表置空。
Node * merge(Node ** pL1, Node ** pL2) {
    Node * head = NULL;
    Node * temp = NULL;
    Node * l1 = *pL1;
    Node * l2 = *pL2;
    if(l1->data < l2->data) {
        head = l1;  temp = l1;   l1 = l1->next;
    } else {
        head = l2;  temp = l2;   l2 = l2->next;
    }
    while(l1!=NULL && l2!=NULL) {
        if(l1->data < l2->data) {
            temp->next = l1;   l1 = l1->next;
            temp = temp->next;
        } else {
            temp->next = l2;  l2 = l2->next;
            temp = temp->next;
        }
    }
    if(l1==NULL) {   temp->next = l2; } 
    else {  temp->next = l1; }
    *pL1 = NULL;  *pL2 = NULL;
    return head;

}
int main(void) {
    Node * l1 = NULL, * l2 = NULL, * l3 = NULL;
    pushBackList(&l1, 2);
    pushBackList(&l1, 4);
    pushBackList(&l1, 6);
    pushBackList(&l2, 1); 
    pushBackList(&l2, 3);
    pushBackList(&l2, 9);
    l3 = merge(&l1, &l2);
    printList(l3);

    //Node * list = NULL;
    //pushBackList(&list, 2);
    //pushBackList(&list, 4);
    //pushBackList(&list, 6);
    //pushBackList(&list, 8);
    //pushBackList(&list, 10);
    //printList(list);
    //printf("size = %d\n", sizeList(list));
    //insertList(&list, 0, 1);
    //insertList(&list, 3, 3);
    //printList(list);
    //printf("2 index = %d\n", findList(list, 2));

    //freeList(&list);


    return 0;
}