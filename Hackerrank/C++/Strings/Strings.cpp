#include <iostream>
#include <string>
using namespace std;

int main() {
   string s1,s2;
   cin>>s1>>s2;
   cout<<s1.length()<<" "<<s2.length()<<endl;
   cout<<s1+s2<<endl;
   cout<<s2[0]+s1.substr(1,s1.length())<<" "<<s1[0]+s2.substr(1,s2.length())<<endl;
    return 0;
}
