#include <iostream>
using namespace std;
struct node {
    
    int data;
    struct node *left;
    struct node *right ;
    
};
void inorder(struct node * root){
    
    inorder(root->left);
    printf("%d",root->data);
    inorder(root->right);
    
}
int main() {
	// your code goes here
	
	int n,r1,r2,r3,r4,r5,r6,r7;
	scanf("%d",&n);
	char cnl=getchar();      //{2,{3,4,5},{5,6,7}}
	char c=getchar();
	scanf("%d",&r1);
//	printf("%d",r1);
	struct node *root= (struct node *)malloc(sizeof(struct node));
	if(r1!=0)
	root->data=r1;
	char cn2=getchar();
	
	if(cn2!='}'){
	char cn3=getchar();   //{2,{3,4,5},{5,6,7}}
	scanf("%d",&r2);
	
	if(r2!=0)
	root->left->data=r2;
	
	char cn4=getchar();
	scanf("%d",&r3);
	if(r3!=0)
	root->left->left->data=r3;
	char cn5=getchar();
	scanf("%d",&r4);
	if(r4!=0)
	root->left->right->data=r4;
	
	
	char cn6=getchar();  //{2,{3,4,5},{5,6,7}}
	char cn7=getchar();
	    if(cn7!='}'){
	char cn8=getchar();
	scanf("%d",&r5);
	if(r5!=0)
	root->right->data=r5;
	char cn9=getchar();
	scanf("%d",&r6);
	if(r6!=0)
	root->right->left->data=r6;
	char cn10=getchar();
	scanf("%d",&r7);
	if(r7!=0)
	root->right->right->data=r7;
	char cn11=getchar();
	char cn12=getchar();
	
	}

	}

    
   // printf("%d",root->left->data);
   void inorder(root);
    return 0;
}
