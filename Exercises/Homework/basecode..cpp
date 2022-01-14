// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

    for(int c = 0; c < 10; c+1){
        gotoxy(10,3+c);
        cout<<"*";
        gotoxy(10,3+c);
        cout<<" ";
        //sleep;
    }
    
}
