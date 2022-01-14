// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	char sym = 0;
	int num = 0;
	int x = 0;
	int y= 0;
	cout<<"What symbol?: ";
	cin>>sym;
	cout<<"How long?: ";
	cin>>num;
	cout<<"Where should it start?"<<endl;
	cout<<"x coor: ";
	cin>>x;
	cout<<"y coor: ";
	cin>>y;
	
	for(int c = 0; c < num; c = c+1){
		gotoxy(x+1,y+7);
		cout<<sym<<endl;
		x = x+1;
		y = y+1;
	}
	
	
	
	
	
	
}
