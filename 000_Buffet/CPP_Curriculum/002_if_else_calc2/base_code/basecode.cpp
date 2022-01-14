// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	cout<<"Enter the 1st number: ";
	int num1;
	cin>>num1;
	cout<<"Enter the operation: ";
	char op;
	cin>>op;
	cout<<"Enter the 2nd number: ";
	int num2;
	cin>>num2;
	if(op == '+'){
		cout<<"The sum is "<<num1+num2;
	}
	if(op == '-'){
		cout<<"The difference is "<<num1-num2;
	}
	if(op == '*'){
		cout<<"The product is "<<num1*num2;
	}
	if(op == '/'){
		cout<<"The quotient is "<<num1/num2;
	}
}
