// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	char sym = 0;
	int l = 0;
	int w = 0;
	int x = 0;
	int y = 0;
	cout<<"What symbol?: ";
	cin>>sym;
	cout<<"How long?: ";
	cin>>l;
	cout<<"How wide?: ";
	cin>>w;
	cout<<"Where should it start?"<<endl;
	cout<<"x coor: ";
	cin>>x;
	cout<<"y coor: ";
	cin>>y;
	cout<<endl;
	
	gotoxy(x+1,y+7);
	for(int c = 0; c < w; c = c+1){
		for(int c2 = 0; c2 < l; c2 = c2+1){
			cout<<sym;
		}
		cout<<endl;
		y = y+1;
		gotoxy(x+1,y+7);
	}
	
	
	

}
