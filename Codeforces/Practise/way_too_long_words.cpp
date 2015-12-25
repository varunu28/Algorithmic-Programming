#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    while(n>0)
    {
        string input;
        cin>>input;
        if(input.length()>10)
        {
            cout<<input[0]<<input.length()-2<<input[input.length()-1]<<endl;
        }
        else
        {
            cout<<input<<endl;
        }
        n--;
    }
    return 0;
}
