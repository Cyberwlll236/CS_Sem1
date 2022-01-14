// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	char sym = 0;
    int num = 0;
    char axis = 0;
    int x = 1;
    int y = 5;
    cout<<"What symbol would you like to string? ";
    cin>>sym;
    cout<<"How many symbols? ";
    cin>>num;
    cout<<"Should it be vertical, horizontal, or diagonal? (h/v/d) ";
    cin>>axis;
    
    if(axis == 'h'){
        for(int c = 0; c < num; c = c+1){
            cout<<sym;}}
    
    if(axis == 'v'){
        for(int c = 0; c < num; c = c+1){
            cout<<sym<<endl;}}
	
	if(axis == 'd'){
		for(int c = 0; c < num; c = c+1){
			gotoxy(x,y);
			cout<<sym<<endl;
			x = x+1; 
			y = y+1;
		}
	}
}
