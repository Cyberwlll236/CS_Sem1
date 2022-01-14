// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	char sym;
	int l;
	int w;
	cout<<"Please enter border character: ";
	cin>>sym;
	cout<<"Please enter box length: ";
	cin>>l;
	cout<<"Please enter box width: ";
	cin>>w;
	
	for(int c = 0; c<l; c = c+1){
		cout<<sym;}
	for(int c = 2; c<w; c = c+1){
		cout<<endl;
		cout<<sym;
		for(int c = 2; c<l; c = c+1){
			cout<<" ";
		}
		cout<<sym;
	}
	cout<<endl;
	if(w>1){
		for(int c = 0; c<l; c = c+1){
		cout<<sym;}}

}
