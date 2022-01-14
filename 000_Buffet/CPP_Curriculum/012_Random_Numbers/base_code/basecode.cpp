// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	gotoxy(50,6);
	for(int c = 0; c < 7; c++){
		cout<<'@';}
	for(int c = 0; c < 5; c = c+1){
		cout<<endl;
		gotoxy(50,7+c);
		cout<<'@';
		for(int c = 0; c < 5; c = c+1){
			cout<<" ";}
		cout<<'@';}
		cout<<endl;
		gotoxy(50,14);
	for(int c = 0; c < 7; c++){
		cout<<'@';}
	cout<<endl;
	
	char f;
	while(true){
		gotoxy(1,0);
		cin>>f;
		if(f == 'q'){
			break;
		}
		gotoxy(53,6);
		cout<<random(9);}

}
