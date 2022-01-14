// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

	int x = 0;
	char y = 'x';
	cout<<"I'm g-not a g-noblin...";
	cout<<"I'm g-not a g-nelf...";
	cout<<"I'm a g-nome, and";
	while(true){
		cout<<"Youve been gnomed!";
		
		cin>>y;
		if(y == 'q'){
			cout<<"WHO!";
			break;
		}
		if(x == 100){
			break;
		}
		x = x+1;
	}


}
