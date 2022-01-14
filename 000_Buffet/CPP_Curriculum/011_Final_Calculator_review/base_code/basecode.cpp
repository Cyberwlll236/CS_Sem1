// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	
	char sym;
	int num1;
	int num2;
	char op;
	cout<<"Border character: ";
	cin>>sym;
	cout<<"1st integer: ";
	cin>>num1;
	cout<<"Operation: ";
	cin>>op;
	cout<<"2nd integer: ";
	cin>>num2;
	gotoxy(50,6);
	for(int c = 0; c < 20; c++){
		cout<<sym;}
	for(int c = 0; c < 7; c = c+1){
		cout<<endl;
		gotoxy(50,7+c);
		cout<<sym;
		for(int c = 0; c < 18; c = c+1){
			cout<<" ";}
		cout<<sym;}
		cout<<endl;
		gotoxy(50,14);
	for(int c = 0; c < 20; c++){
		cout<<sym;}
	cout<<endl;
	gotoxy(55,6);
	cout<<num1<<" "<<op<<" "<<num2<<" "<<"="<<" ";
	if(op == '+'){
		cout<<num1+num2;}
	if(op == '-'){
		cout<<num1-num2;}
	if(op == '*'){
		cout<<num1*num2;}
	if(op == '/'){
		cout<<num1/num2;}
	if(op == '%'){
		cout<<num1%num2;}
}
