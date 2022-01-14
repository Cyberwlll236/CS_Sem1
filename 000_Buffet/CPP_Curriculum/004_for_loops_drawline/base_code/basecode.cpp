// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
    char sym = 0;
    int num = 0;
    char axis = 0;
    int c = 0;
    cout<<"What symbol would you like to string? ";
    cin>>sym;
    cout<<"How many symbols? ";
    cin>>num;
    cout<<"Should it be vertical or horizontal? (h/v) ";
    cin>>axis;
    
    if(axis == 'h'){
        while(true){
            cout<<sym;
            c = c+1;
        if(c == num){
            break;
        }}}
    
    if(axis == 'v'){
        while(true){
            cout<<sym<<endl;
            c = c+1;
        if(c == num){
            break;
        }}}
        
    
}
        
    
