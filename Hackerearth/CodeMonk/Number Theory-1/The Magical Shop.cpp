#include <iostream>
#include <string>
using namespace std;

int main() {
    unsigned long long int A, B, potion;
    potion = 0;
    string inp;
    cin >> A >> B >> inp;
    int i = 0;
    while(i < inp.length())
    {
        if(inp[i] == '1')
        {
            potion = (potion + A);
        }
        i++;
        A = (A*A)%B;
        //cout<<"Mid Potion: "<<potion<<endl;
        //cout<<"Mid A: "<<A<<endl;
    }
    
    cout<<potion%B;
	return 0;
}