#include <iostream>
#include <string> 
using namespace std;

int main()
{
	string inp;
	cin >>inp;

	if(inp.find("000000")!=-1 || inp.find("111111")!=-1)
	{
		cout << "Sorry, sorry!";
	}
	else
	{
		cout << "Good luck!";
	}
    return 0;
}
