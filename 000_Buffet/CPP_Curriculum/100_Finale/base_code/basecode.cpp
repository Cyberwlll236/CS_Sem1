// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	gotoxy(27,2);
	cout<<"X";
	gotoxy(20,3);
	cout<<"      /\\"<<endl;
	gotoxy(20,4);
	cout<<"     //\\\\"<<endl;
	gotoxy(20,5);
	cout<<"    ///\\@\\"<<endl;
	gotoxy(20,6);
	cout<<"   ////\\\\\\\\"<<endl;
	gotoxy(20,7);
	cout<<"     //\\\\"<<endl;
	gotoxy(20,8);
	cout<<"    ///\\\\\\"<<endl;;
	gotoxy(20,9);
	cout<<"   //@/\\\\\\\\"<<endl;
	gotoxy(20,10);
	cout<<"  /////\\\\\\\\\\"<<endl;
	gotoxy(20,11);
	cout<<"   ////\\\\\\\\"<<endl;
	gotoxy(20,12);
	cout<<"  /////\\\\@\\\\"<<endl;;
	gotoxy(20,13);
	cout<<" ///@//\\\\\\\\\\\\"<<endl;
	gotoxy(20,14);
	cout<<"///////\\\\\\\\\\\\\\"<<endl;
	gotoxy(26,15);
	cout<<"|| ##"<<endl;
	gotoxy(26,16);
	cout<<"|| ##"<<endl;
	
	
		gotoxy(14,12);
	for(int c = 0; c < 3; c++){
		cout<<"#";}
	for(int c = 0; c < 4; c = c+1){
		cout<<endl;
		gotoxy(14,13+c);
		cout<<"#";
		for(int c = 0; c < 1; c = c+1){
			cout<<" ";}
		cout<<"#";}
		cout<<endl;
		gotoxy(14,16);
	for(int c = 0; c < 3; c++){
		cout<<"#";}
	cout<<endl;
	gotoxy(15,14);
	cout<<"#";
	

	while(true){
		int r = random(100);
		int r2 = random(100);
		int r3 = random(100);
		if(((r < 20) || (r > 30)) && ((r2 < 20) || (r2 > 30)) && ((r3 < 20) || (r3 > 30))){
		for(int c = 1; c < 20; c++){
			gotoxy(r,c);
			cout<<"*"<<endl;
			gotoxy(r2,c);
			cout<<"*"<<endl;
			gotoxy(r3,c);
			cout<<"*"<<endl;
			sleep(1);
			gotoxy(r,c);
			cout<<" "<<endl;;
			gotoxy(r2,c);
			cout<<" "<<endl;;
			gotoxy(r3,c);
			cout<<" "<<endl;;
		}
	}}
}
