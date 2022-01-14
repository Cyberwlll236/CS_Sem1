// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	
	char sym;
	int l;
	int w;
	int x;
	int y;
	cout<<"Please enter border character: ";
	cin>>sym;
	cout<<"Please enter box length: ";
	cin>>l;
	cout<<"Please enter box width: ";
	cin>>w;
	cout<<"Please enter box location"<<endl<<"x coor: ";
	cin>>x;
	cout<<"y coor: ";
	cin>>y;
	gotoxy(x,y+7);
	for(int c = 0; c<l; c = c+1){
		cout<<sym;}
		cout<<endl;
	for(int c = 2; c<w; c = c+1){
		gotoxy(x,y+8);
		cout<<sym;
		gotoxy(x+l-1,y+8);
		cout<<sym;
		y = y+1;
		cout<<endl;
	}
	gotoxy(x,y+8+w);
	if(w>1){
		for(int c = 0; c<l; c = c+1){
		cout<<sym;}}

	
}
